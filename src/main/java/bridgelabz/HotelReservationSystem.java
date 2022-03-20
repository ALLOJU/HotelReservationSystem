package bridgelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class HotelReservationSystem {

	/**
	 * Creating arraylist of hotel
	 */
	public static ArrayList<Hotel> hotelList=new ArrayList<>();
	Map<String, Integer> minRateInRegular = new HashMap<>();
	Hotel result1;

	/*
	 * @Purpose : ArrayList of Hotel
	 * 
	 * @Param : Hotel
	 * 
	 * @Return : Arraylist
	 */
	public ArrayList<Hotel> getArrayList() {
		return hotelList;
	}




	/*
	 * @Purpose : Set the Arraylist
	 * 
	 * @Param : ArrayList
	 */
	public void setArrayList(ArrayList<Hotel> hotelList) {
		this.hotelList = hotelList;
	}

	/**
	 * Creating Scanner object for taking input from the user
	 */
	Scanner sc = new Scanner(System.in);

	/**
	 * addHotel -method used to add hotels to arraylist here im using scanner object
	 * to take input from the user and then using parametrized constructor im
	 * passing values to the hotel object and added hotel object to the array list
	 * 
	 * @return - Array list of objects to add hotel object
	 */
	public boolean addHotel() {
		System.out.println("Enter Number of hotels to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Hotel Name");
			String HotelName = sc.next();
			System.out.println("Enter Hotel Rating");
			int rating = sc.nextInt();
			System.out.println("Enter Week Day rate for Regular Customer");
			int regularWeekDayRate = sc.nextInt();

			System.out.println("Enter Week End rate for Regular Customer");
			int regularWeekEndRate = sc.nextInt();

			Hotel hotel=new Hotel(HotelName,rating,regularWeekEndRate,regularWeekEndRate);
			hotel.setHotelName(HotelName);
			hotel.setRating(rating);
			hotel.setRegularWeekDayRate(regularWeekDayRate);
			hotel.setRegularWeekEndRate(regularWeekEndRate);
			hotelList.add(hotel);
		}

		return true;

	}
	/**
	 * Method to find cheapest hotel for thr given input date range
	 * @param sd -Starting input date
	 * @param ed - Ending input date
	 */
	public  Hotel findCheapestHotel(LocalDate  startDate, LocalDate  endDate) {
		//calculated days between start and end date
		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		int cheapRate;
		/**
		 * here im calculated cheapest hotel by using Comparator class 
		 * using min method of collections class founded minimum value of regular week day rate
		 * then multiplied days between start and end date with regular weekday rate to find the rate of the
		 * cheapest hotel
		 */
		Hotel cheapest = Collections.min(hotelList, Comparator.comparing(hotel -> hotel.getRegularWeekDayRate()));
		cheapRate = (int) ((daysBetween + 1) * cheapest.getRegularWeekDayRate());
		System.out.println("Cheapest Hotel Name: " + cheapest.getHotelName() + "\nTotal Rate: " + cheapRate);
		return cheapest;	
	}
	/**
	 * weekEndData is a method through which calculate the cheapest hotel for
	 * weekends also. dateList is use to store the date in the form of list traverse
	 * the date list using advance for loop. 
	 * day of week is use to calculate the day at that particular date.
	 */
	//UC4
	public void weekEndData(LocalDate startDate, LocalDate lastDate) {

		/**
		 * Added start date to last dates to the datesList
		 */
		List<LocalDate> dateList = startDate.datesUntil(lastDate).collect(Collectors.toList());
		dateList.add(lastDate);
		for (LocalDate localDate : dateList) {
			//calculated days of the week
			DayOfWeek dayOfWeek2 = DayOfWeek.from(localDate);
			if (dayOfWeek2.equals(DayOfWeek.SATURDAY) || dayOfWeek2.equals(DayOfWeek.SUNDAY)) {
				for (Hotel hotel : hotelList) {
					//here calculated rate for week ends
					hotel.totalRegularRate += hotel.getRegularWeekEndRate();
				}
			} else {
				for (Hotel hotel : hotelList) {
					hotel.totalRegularRate += hotel.getRegularWeekDayRate();
				}
			}
		}

		result1 = hotelList.get(0);
		for (Hotel hotel : hotelList) {
			if (result1.totalRegularRate > hotel.totalRegularRate) {
				result1 = hotel;
				minRateInRegular.put(hotel.getHotelName(), hotel.totalRegularRate);
			}
		}
		minRateInRegular.put(result1.getHotelName(), result1.totalRegularRate);
		for (Hotel hotel : hotelList) {
			if (hotel.totalRegularRate == result1.totalRegularRate) {
				minRateInRegular.put(hotel.getHotelName(), hotel.totalRegularRate);
			}
		}
	}
	/**
	 * this function is use to find the cheapest hotel.
	 */
	public void findCheapestRegularHotels(LocalDate startDate, LocalDate lastDate) {
		weekEndData(startDate, lastDate);
		System.out.println("Minimum Rate Hotels");
		minRateInRegular.forEach((key, value) -> System.out.println("Hotel Name: " + key + "\nTotal Rate: " + value));
	}


	public  Hotel getCheapestBestRatedHotel(String startDate, String endDate) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("ddMMMyyyy");
		LocalDate startDateInput = LocalDate.parse(startDate, dateFormat);
		LocalDate endDateInput = LocalDate.parse(endDate, dateFormat);
		//calculated no of days between start date and end date
		int noOfDaysToBook = (int) ChronoUnit.DAYS.between(startDateInput, endDateInput) + 1;
		List<DayOfWeek> daysList = new ArrayList<>();
		daysList = Stream.iterate(startDateInput.getDayOfWeek(), day -> day.plus(1)).limit(noOfDaysToBook).collect(Collectors.toList());
		int noOfWeekends = (int) daysList.stream().filter(day -> 
		day.equals(DayOfWeek.SATURDAY) || day.equals(DayOfWeek.SUNDAY)).count();
		int noOfWeekdays = daysList.size() - noOfWeekends;
		int minCost = hotelList.get(0).getRegularWeekDayRate() * noOfWeekdays + hotelList.get(0).getRegularWeekDayRate() * noOfWeekends ;
		List<Hotel> cheapestHotelList = new ArrayList<>();
		cheapestHotelList.add(hotelList.get(0));
		for(int i = 1; i < hotelList.size(); i++) {
			if(hotelList.get(i).getRegularWeekDayRate() * noOfWeekdays + hotelList.get(i).getRegularWeekEndRate() * noOfWeekends < minCost) {
				minCost = hotelList.get(i).getRegularWeekDayRate() * noOfWeekdays + hotelList.get(i).getRegularWeekEndRate() * noOfWeekends;
				for(int j = 0; j < cheapestHotelList.size(); j++) 
					cheapestHotelList.remove(j);
				cheapestHotelList.add(hotelList.get(i));
			}
			if(hotelList.get(i).getRegularWeekDayRate() * noOfWeekdays + hotelList.get(i).getRegularWeekEndRate() * noOfWeekends == minCost)
				cheapestHotelList.add(hotelList.get(i));
		}
		Hotel cheapestBestRatedHotel = cheapestHotelList.stream().max((hotelOne, hotelTwo) -> hotelOne.getRating() -hotelTwo.getRating()).orElse(null);
		String cheapestBestRatedHotelInfo = cheapestBestRatedHotel.getHotelName() + ", Rating: " + cheapestBestRatedHotel.getRating() + ", Total Cost: $" + minCost;
		System.out.println("Cheapest Best Rated Hotel :- " + cheapestBestRatedHotelInfo);
		return cheapestBestRatedHotel;
	}



}

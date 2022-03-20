package bridgelabz;

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



public class HotelReservationSystem {

	/**
	 * Creating arraylist of hotel
	 */
	public static ArrayList<Hotel> hotelList=new ArrayList<>();


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
			int weekDayRate = sc.nextInt();
			
			System.out.println("Enter Week End rate for Regular Customer");
			int weekEndRate = sc.nextInt();
		
			Hotel hotel=new Hotel(HotelName, rating,weekDayRate,weekEndRate);
			hotel.setHotelName(HotelName);
			hotel.setRating(rating);
			hotel.setWeekDayRate(weekDayRate);
			hotel.setWeekEndRate(weekEndRate);
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
		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		int cheapRate;
		Hotel cheapest = Collections.min(hotelList, Comparator.comparing(hotel -> hotel.getWeekDayRate()));
		cheapRate = (int) ((daysBetween + 1) * cheapest.getWeekDayRate());
		System.out.println("Cheapest Hotel Name: " + cheapest.getHotelName() + "\nTotal Rate: " + cheapRate);
		return cheapest;
		
		
	}

	

	

}

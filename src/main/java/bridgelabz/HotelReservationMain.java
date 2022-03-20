package bridgelabz;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class HotelReservationMain {
	/**
	 * PURPOSE: main method to manipulate all hotel operations
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * PURPOSE:
		 * 
		 */
		/**
		 * 1.printing welcome to hotels message 2.Creating object for the hotel
		 * reservationsystem class using new operator 3.adding hotels to the arraylist
		 * 4.printing arraylist values by using getArraylist method and using streams
		 * printing values of hotels
		 */
		System.out.println("Welcome to Hotel Reservation System");
		int num;
		//multiaddrbook.addAddressBook();
		do {
			System.out.println("Please Enter 1 to add Hotels");
			System.out.println("Please Enter 2 to find cheapest hotel for date input range");
			System.out.println("Please Enter 3 to find cheapest hotel for regular customer");
			System.out.println("Please Enter 4 to find cheapes best rated hotel for regular customer");


			System.out.println("Choose option to perform action");
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

			switch(num) {
			case 1:

				/**
				 * 2.Creating object for the hotel reservationsystem class using new operator
				 */
				/**
				 * 3.adding hotels to the arraylist
				 */
				hotelReservationSystem.addHotel();
				/**
				 * 4.printing arraylist values by using getArraylist method and using streams
				 * printing values of hotels
				 */
				hotelReservationSystem.getArrayList().forEach(hotelNameList ->
				System.out.println(hotelNameList));
				break;

				/**
				 * 5.calling method to find cheapestcost
				 */
				/*
				 * UC-2 To find Cheapest rate on given date intervals
				 */
			case 2:
				LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
				LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
				Hotel cheapestHotel = hotelReservationSystem.findCheapestHotel(startDate, lastDate);
				break;
			case 3:
				LocalDate startDateForRegular = LocalDate.of(2020, Month.SEPTEMBER, 11);
				LocalDate lastDateForRegular = LocalDate.of(2020, Month.SEPTEMBER, 12);
				hotelReservationSystem.findCheapestRegularHotels(startDateForRegular, lastDateForRegular);
				break;
			
			case 4:
				
				System.out.println("Enter the start date (DD-MMM-YYYY)");
				String sd = sc.next();
				System.out.println("Enter the end date (DD-MMM-YYYY)");
				String ed = sc.next();
				HotelReservationSystem.getCheapestBestRatedHotel(sd, ed);
				break;
			}
		}while(num!=0);

	}
}

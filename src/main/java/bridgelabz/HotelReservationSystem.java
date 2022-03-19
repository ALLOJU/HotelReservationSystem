package bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {

	/**
	 * Creating arraylist of hotel
	 */
	public ArrayList<Hotel> arrayList;

	/*
	 * @Purpose : Adding Hotel Reservation System
	 * 
	 * @Param : Arraylist of Hotels
	 */
	public HotelReservationSystem() {
		arrayList = new ArrayList<Hotel>();
	}

	/*
	 * @Purpose : ArrayList of Hotel
	 * 
	 * @Param : Hotel
	 * 
	 * @Return : Arraylist
	 */
	public ArrayList<Hotel> getArrayList() {
		return arrayList;
	}

	/*
	 * @Purpose : Set the Arraylist
	 * 
	 * @Param : ArrayList
	 */
	public void setArrayList(ArrayList<Hotel> arrayList) {
		this.arrayList = arrayList;
	}
	/**
	 * Creating Scanner object for taking input from the user
	 */
	Scanner sc=new Scanner(System.in);
	/**
	 * addHotel -method used to add hotels to arraylist
	 * here im using scanner object to take input from the user and then using parametrized constructor im passing 
	 * values to the hotel object and added hotel object to the array list
	 * 
	 * @return - Array list of objects to add hotel object
	 */
	public boolean addHotel() {
		System.out.println("Enter Number of hotels to add");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("Enter Hotel Name");
		String HotelName=sc.next();
		System.out.println("Enter Hotel Rating");
		int rating=sc.nextInt();
		System.out.println("Enter Week Day rate for Regular Customer");
		double weekDayRatePerRegularCustomer=sc.nextDouble();
		System.out.println("Enter Week Day rate for Rewards Customer");
		double weekDayRatePerRewardsCustomer=sc.nextDouble();
		System.out.println("Enter Week End rate for Regular Customer");
		double weekEndRatePerRegularCustomer=sc.nextDouble();
		System.out.println("Enter Week End rate for Rewards Customer");
		double weekEndRatePerRewardsCustomer=sc.nextDouble();
		
		Hotel hotel=new Hotel(HotelName, rating, weekDayRatePerRegularCustomer, weekDayRatePerRewardsCustomer, weekEndRatePerRegularCustomer, weekEndRatePerRewardsCustomer);
		 arrayList.add(hotel);
		}
	
		return true;
		
	}



}

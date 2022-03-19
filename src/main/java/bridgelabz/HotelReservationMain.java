package bridgelabz;

public class HotelReservationMain {
	/**
	 * PURPOSE:
	 * main method to manipulate all hotel operations
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * PURPOSE:
		 * 
		 */
		/**
		 * 1.printing welcome to hotels message
		 * 2.Creating object for the hotel reservationsystem class using new operator
		 * 3.adding hotels to the arraylist
		 * 4.printing arraylist values by using getArraylist method and using streams printing values of hotels
		 */
		System.out.println("Welcome to Hotel Reservation System");
		try {
			
		
			/**
			 * 2.Creating object for the hotel reservationsystem class using new operator
			 */
			HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
			/**
			 * 3.adding hotels to the arraylist
			 */
			hotelReservationSystem.addHotel();
			/**
			 * 4.printing arraylist values by using getArraylist method and using streams printing values of hotels
			 */
			hotelReservationSystem.getArrayList().forEach(hotelNameList -> System.out.println(hotelNameList));

		} catch (Exception e) {
			System.out.println("Problem In Adding Hotels");
		}
	}
}

package bridgelabz;

public class HotelReservation {
	/**
	 * PURPOSE:
	 * main method to manipulate all hotel operations
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * printing welcome to hotels printed
		 */
		System.out.println("Welcome to Hotel Reservation System");
		try {
			/**
			 * creating hotel objects with hotel name and rates for regular week day
			 * here im taking hotels names as LakeWood,BridgeWood,RidgeWood
			 */
			Hotel hotel1 = new Hotel("LakeWood", 110);
			Hotel hotel2 = new Hotel("BridgeWood", 160);
			Hotel hotel3 = new Hotel("RidgeWood", 220);
			/**
			 * Creating object for the hotel reservationsystem class using new operator
			 */
			HotelReservationSystem hotelSystem = new HotelReservationSystem();
			/**
			 * adding hotels to the hotel system object using add method provided in hotelReservation System
			 */
			hotelSystem.add(hotel1);
			hotelSystem.add(hotel2);
			hotelSystem.add(hotel3);
			/**
			 * printing arraylist values by using getArraylist method and using streams printing values of hotels
			 */
			hotelSystem.getArrayList().forEach(hotelNameList -> System.out.println(hotelNameList));

		} catch (Exception e) {
			System.out.println("Problem In Adding Hotels");
		}
	}
}

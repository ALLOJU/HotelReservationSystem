package bridgelabz;

public class HotelReservation {
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");
		try {
			Hotel hotel1 = new Hotel("LakeWood", 110);
			Hotel hotel2 = new Hotel("BridgeWood", 160);
			Hotel hotel3 = new Hotel("RidgeWood", 220);
			HotelReservationSystem hotelSystem = new HotelReservationSystem();
			hotelSystem.add(hotel1);
			hotelSystem.add(hotel2);
			hotelSystem.add(hotel3);
			hotelSystem.getArrayList().forEach(hotelNameList -> System.out.println(hotelNameList));

		} catch (Exception e) {
			System.out.println("Problem In Adding Hotels");
		}
	}
}

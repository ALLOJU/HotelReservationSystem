import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import bridgelabz.Hotel;
import bridgelabz.HotelReservationSystem;


public class HotelReservationSystemTest {

	@Test
	public void GivenHotels_AddedToTheHotelReservationSystem() {
		try {
			System.out.println("Welcome to the Hotel Registration system");
			Hotel hotel1 = new Hotel("LakeWood", 110);
			HotelReservationSystem hotelSystem = new HotelReservationSystem();
			hotelSystem.add(hotel1);
			List<Hotel> hotelsList = hotelSystem.getArrayList();
			assertTrue(hotelsList.contains(hotel1));
		} catch (Exception e) {
			System.out.println("Issue In Adding Hotel1");
		}
		try {
			Hotel hotel2 = new Hotel("BridgeWood", 160);
			HotelReservationSystem hotelSystem = new HotelReservationSystem();
			hotelSystem.add(hotel2);
			List<Hotel> hotelsList = hotelSystem.getArrayList();
			assertTrue(hotelsList.contains(hotel2));
		} catch (Exception e) {
			System.out.println("Issue In Adding Hotel2");
		}
		try {
			Hotel hotel3 = new Hotel("RidgeWood", 220);
			HotelReservationSystem hotelSystem = new HotelReservationSystem();
			hotelSystem.add(hotel3);
			List<Hotel> hotelsList = hotelSystem.getArrayList();
			assertTrue(hotelsList.contains(hotel3));
		} catch (Exception e) {
			System.out.println("Issue In Adding Hotel3");
		}


	}
}

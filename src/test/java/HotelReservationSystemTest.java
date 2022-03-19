import org.junit.Assert;
import org.junit.Test;
import bridgelabz.HotelReservationSystem;


public class HotelReservationSystemTest {

	@Test
	public void GivenHotels_AddedToTheHotelReservationSystem() {
		try {
			System.out.println("Welcome to the Hotel Registration system");
			HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
			boolean result=hotelReservationSystem.addHotel();
			Assert.assertEquals(true, result);
			
		} catch (Exception e) {
			System.out.println("Issue In Adding Hotel1");
		}
	


	}
}

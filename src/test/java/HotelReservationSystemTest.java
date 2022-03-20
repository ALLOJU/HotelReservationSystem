import java.time.LocalDate;
import java.time.Month;

import org.junit.Assert;
import org.junit.Test;

import bridgelabz.Hotel;
import bridgelabz.HotelReservationSystem;

public class HotelReservationSystemTest {

	@Test
	public void GivenHotels_AddedToTheHotelReservationSystem() {
		try {
			System.out.println("Welcome to the Hotel Registration system");
			HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
			boolean result = hotelReservationSystem.addHotel();
			Assert.assertEquals(true, result);

		} catch (Exception e) {
			System.out.println("Issue In Adding Hotel1");
		}
	}

	@Test
	public void givenDateRange_ShouldReturnCheapestHotel() {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		//boolean result = hotelReservationSystem.addHotel();
		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
		LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
		Hotel cheapestHotel = hotelReservationSystem.findCheapestHotel(startDate, lastDate);
		Assert.assertEquals("lakewood", cheapestHotel.getHotelName().toLowerCase());
	}
	@Test
	public void givenDateRange_ShouldReturnCheapestBestHotel() {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		Hotel cheapestHotelInfo=hotelReservationSystem.getCheapestBestRatedHotel("11Sep2020","12Sep2020");
		Assert.assertEquals("bridgewood", cheapestHotelInfo.getHotelName().toLowerCase());
	}
}

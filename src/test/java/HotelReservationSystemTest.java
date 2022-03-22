import java.time.LocalDate;
import java.time.Month;

import org.junit.Assert;
import org.junit.Test;

import bridgelabz.CustomerTypeException;
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
		// boolean result = hotelReservationSystem.addHotel();
		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
		LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
		Hotel cheapestHotel = hotelReservationSystem.findCheapestHotel(startDate, lastDate);
		Assert.assertEquals("lakewood", cheapestHotel.getHotelName().toLowerCase());
	}

	@Test
	public void givenDateRange_ShouldReturnCheapestBestHotel() {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		String cheapestHotelInfo = hotelReservationSystem.getCheapestBestRatedHotel("11Sep2020", "12Sep2020");
		Assert.assertEquals("bridgewood", cheapestHotelInfo.toLowerCase());
	}

	@Test
	public void given3Hotels_InAGivenDateRange_ShouldReturnBestRatedHotel() {

		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		String bestRatedHotelInfo = hotelReservationSystem.getBestRatedHotel("11Sep2020", "12Sep2020");
		Assert.assertEquals("Ridgewood, Total Cost: $370", bestRatedHotelInfo.toLowerCase());
	}

	// UC-10
	@Test
	public void given3Hotels_WhenDateRangeProvidedForRewardsCustomer_ShouldReturnCheapestBestRatedHotel() {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		try {
			hotelReservationSystem.typeOfCustomer("REWARDS");
		} catch (CustomerTypeException e) {
			e.printStackTrace();
		}
		String cheapestBestRatedHotelForRewards = hotelReservationSystem.cheapestBestRatedHotelSelector("11Sep2020",
				"12Sep2020");
		System.out.println(cheapestBestRatedHotelForRewards);
		Assert.assertEquals("Ridgewood, Rating:5,Total Cost:$140", cheapestBestRatedHotelForRewards.toLowerCase());
	}
}

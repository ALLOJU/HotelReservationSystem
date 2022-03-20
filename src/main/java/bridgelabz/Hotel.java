package bridgelabz;

public class Hotel {

	/**
	 * Creating hotelname and regular week day
	 */
	private String HotelName;
	private int rating;
	private int weekDayRate;
	private int weekEndRate;
	
	
	public Hotel(String hotelName, int rating, int weekDayRate, int weekEndRate) {
		super();
		HotelName = hotelName;
		this.rating = rating;
		this.weekDayRate = weekDayRate;
		this.weekEndRate = weekEndRate;
	}


	public String getHotelName() {
		return HotelName;
	}


	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public double getWeekDayRate() {
		return weekDayRate;
	}


	public void setWeekDayRate(int weekDayRate) {
		this.weekDayRate = weekDayRate;
	}


	public double getWeekEndRate() {
		return weekEndRate;
	}


	public void setWeekEndRate(int weekEndRate) {
		this.weekEndRate = weekEndRate;
	}


	@Override
	public String toString() {
		return "Hotel [HotelName=" + HotelName + ", rating=" + rating + ", weekDayRate=" + weekDayRate
				+ ", weekEndRate=" + weekEndRate + "]";
	}
	
	
	
	
	
}

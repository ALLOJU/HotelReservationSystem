package bridgelabz;

public class Hotel {

	/**
	 * Creating hotelname and regular week day
	 */
	private String HotelName;
	private int rating;
	private int regularWeekDayRate;
	private int regularWeekEndRate;
	public int totalRegularRate;
	
	@Override
	public String toString() {
		return "Hotel [HotelName=" + HotelName + ", rating=" + rating + ", regularWeekDayRate=" + regularWeekDayRate
				+ ", regularWeekEndRate=" + regularWeekEndRate + "]";
	}

	public Hotel(String hotelName, int rating, int regularWeekDayRate, int regularWeekEndRate) {
		super();
		HotelName = hotelName;
		this.rating = rating;
		this.regularWeekDayRate = regularWeekDayRate;
		this.regularWeekEndRate = regularWeekEndRate;
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

	public int getRegularWeekDayRate() {
		return regularWeekDayRate;
	}

	public void setRegularWeekDayRate(int regularWeekDayRate) {
		this.regularWeekDayRate = regularWeekDayRate;
	}

	public int getRegularWeekEndRate() {
		return regularWeekEndRate;
	}

	public void setRegularWeekEndRate(int regularWeekEndRate) {
		this.regularWeekEndRate = regularWeekEndRate;
	}
	
	
	
}

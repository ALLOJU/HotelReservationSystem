package bridgelabz;

public class Hotel {

	/**
	 * Creating hotelname and regular week day
	 */
	private String HotelName;
	private int rating;
	private int regularWeekDayRate;
	private int regularWeekEndRate;
	private int rewardsWeekDayRate;
	private int rewardsWeekEndRate;
	
	
	public int totalRegularRate;


	@Override
	public String toString() {
		return "Hotel [HotelName=" + HotelName + ", rating=" + rating + ", regularWeekDayRate=" + regularWeekDayRate
				+ ", regularWeekEndRate=" + regularWeekEndRate + ", rewardsWeekDayRate=" + rewardsWeekDayRate
				+ ", rewardsWeekEndRate=" + rewardsWeekEndRate + ", totalRegularRate=" + totalRegularRate + "]";
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


	public int getRewardsWeekDayRate() {
		return rewardsWeekDayRate;
	}


	public void setRewardsWeekDayRate(int rewardsWeekDayRate) {
		this.rewardsWeekDayRate = rewardsWeekDayRate;
	}


	public int getRewardsWeekEndRate() {
		return rewardsWeekEndRate;
	}


	public void setRewardsWeekEndRate(int rewardsWeekEndRate) {
		this.rewardsWeekEndRate = rewardsWeekEndRate;
	}


	public int getTotalRegularRate() {
		return totalRegularRate;
	}


	public void setTotalRegularRate(int totalRegularRate) {
		this.totalRegularRate = totalRegularRate;
	}


	public Hotel(String hotelName, int rating, int regularWeekDayRate, int regularWeekEndRate, int rewardsWeekDayRate,
			int rewardsWeekEndRate) {
		super();
		HotelName = hotelName;
		this.rating = rating;
		this.regularWeekDayRate = regularWeekDayRate;
		this.regularWeekEndRate = regularWeekEndRate;
		this.rewardsWeekDayRate = rewardsWeekDayRate;
		this.rewardsWeekEndRate = rewardsWeekEndRate;
		this.totalRegularRate = totalRegularRate;
	}
	
	
}

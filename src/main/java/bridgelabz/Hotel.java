package bridgelabz;

public class Hotel {

	/**
	 * Creating hotelname and regular week day
	 */
	private String HotelName;
	private int rating;
	private double weekDayRatePerRegularCustomer;
	private double weekDayRatePerRewardsCustomer;
	private double weekEndRatePerRegularCustomer;
	private double weekEndRatePerRewardsCustomer;
	
	public Hotel(String hotelName, int rating, double weekDayRatePerRegularCustomer,
			double weekDayRatePerRewardsCustomer, double weekEndRatePerRegularCustomer,
			double weekEndRatePerRewardsCustomer) {
		super();
		HotelName = hotelName;
		this.rating = rating;
		this.weekDayRatePerRegularCustomer = weekDayRatePerRegularCustomer;
		this.weekDayRatePerRewardsCustomer = weekDayRatePerRewardsCustomer;
		this.weekEndRatePerRegularCustomer = weekEndRatePerRegularCustomer;
		this.weekEndRatePerRewardsCustomer = weekEndRatePerRewardsCustomer;
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

	public double getWeekDayRatePerRegularCustomer() {
		return weekDayRatePerRegularCustomer;
	}

	public void setWeekDayRatePerRegularCustomer(double weekDayRatePerRegularCustomer) {
		this.weekDayRatePerRegularCustomer = weekDayRatePerRegularCustomer;
	}

	public double getWeekDayRatePerRewardsCustomer() {
		return weekDayRatePerRewardsCustomer;
	}

	public void setWeekDayRatePerRewardsCustomer(double weekDayRatePerRewardsCustomer) {
		this.weekDayRatePerRewardsCustomer = weekDayRatePerRewardsCustomer;
	}

	public double getWeekEndRatePerRegularCustomer() {
		return weekEndRatePerRegularCustomer;
	}

	public void setWeekEndRatePerRegularCustomer(double weekEndRatePerRegularCustomer) {
		this.weekEndRatePerRegularCustomer = weekEndRatePerRegularCustomer;
	}

	public double getWeekEndRatePerRewardsCustomer() {
		return weekEndRatePerRewardsCustomer;
	}

	public void setWeekEndRatePerRewardsCustomer(double weekEndRatePerRewardsCustomer) {
		this.weekEndRatePerRewardsCustomer = weekEndRatePerRewardsCustomer;
	}

	@Override
	public String toString() {
		return "Hotel [HotelName=" + HotelName + ", rating=" + rating + ", weekDayRatePerRegularCustomer="
				+ weekDayRatePerRegularCustomer + ", weekDayRatePerRewardsCustomer=" + weekDayRatePerRewardsCustomer
				+ ", weekEndRatePerRegularCustomer=" + weekEndRatePerRegularCustomer
				+ ", weekEndRatePerRewardsCustomer=" + weekEndRatePerRewardsCustomer + "]";
	}
	
	
	
	
	
}

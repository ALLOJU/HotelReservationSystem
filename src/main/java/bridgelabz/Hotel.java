package bridgelabz;

public class Hotel {

	/**
	 * Creating hotelname and regular week day
	 */
	private String HotelName;
	private int RegularWeekDay;
	public String getHotelName() {
		return HotelName;
	}
	/**
	 * setting hotel name
	 * @param hotelName - input name of the hotel
	 */
	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}
	/**
	 * getters method
	 * @return
	 */
	public int getRegularWeekDay() {
		return RegularWeekDay;
	}
	public void setRegularWeekDay(int regularWeekDay) {
		RegularWeekDay = regularWeekDay;
	}
	/**
	 * To String method to print output to the console
	 */
	@Override
	public String toString() {
		return "Hotel [HotelName=" + HotelName + ", RegularWeekDay=" + RegularWeekDay + "]";
	}
	public Hotel(String hotelName, int regularWeekDay) {
		super();
		HotelName = hotelName;
		RegularWeekDay = regularWeekDay;
	}
	
}

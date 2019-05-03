package HomeWork;

public class HomeWork_164_Methods_Return_9_SimpleRoom {

	/*
	 * the room is already booked between 7/1/2018 - 7/8/2018 and not available
	 * accepting bookings only for year of 2018
	 */

	public static void main(String[] args) {
		
System.out.println(simpleRoomBook(true,7,2,2018));
		
	}
	
	
	public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
		if (year != 2018 || isAvailable == false) {
			return false;
		} else {
			if ((month == 7) && (day >= 1 && day <= 8)) {
				return false;
			} else {
				return true;
			}
		}
	}
}

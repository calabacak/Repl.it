package day12;

public class NumberOfDayInAmonth {
	
	public static void main(String[] args) {
		
		int year=2000;
		
		if ((year>=1 || year<=9999)	&&	(year%4==0)	&&	(year%100==0) &&	(year%400==0)			) {
		System.out.println(year + " is a leap year");			
		}
		else System.out.println("not valid");
	}

}

package day12;

import java.util.Scanner;

public class YearsAndDays {
	public static void main(String[] args) {
		
		long year, day, hour, mins, num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter minutes");
		
		mins = scan.nextLong();
		
		year = mins/(60*24*365);
		num = mins%(60*24*365);
		day=num/365;
		
		
		System.out.println( year + " year" + " and " + day);
		
	}

}

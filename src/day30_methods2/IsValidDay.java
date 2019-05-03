package day30_methods2;

import java.util.Scanner;

public class IsValidDay {
	public static void main(String[] args) {
		isValidDay("MONDAY");
		
	}
	
	public static void isValidDay(String day) {
//		Scanner scan= new Scanner(System.in);
//		System.out.println("enter a day");
//		day= scan.next();
		day=day.toLowerCase();
		System.out.println(day);
		if(day.contentEquals("monday")|| day.contentEquals("tuesday") ||day.contentEquals("wednesday") ||day.contentEquals("thursday")||
				day.contentEquals("friday")||day.contentEquals("saturday")||day.contentEquals("sunday")) {
			System.out.println(true);
		}else System.out.println(false);
		
	}

}

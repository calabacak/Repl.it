package day27_arrays05;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {

		int[] timeFirst = new int[2];
		int[] timeSecond = new int[2];

		Scanner scan = new Scanner(System.in);
		System.out.println("enter hour first and minute later");
		int hour; // 1-24
		int min; // 0-59

		timeFirst[0] = scan.nextInt();
		timeFirst[1] = scan.nextInt();

		System.out.println("enter hour first and minute later");

		timeSecond[0] = scan.nextInt();
		timeSecond[1] = scan.nextInt();
		
		// cengiz always check the negative situations first, this needs to be your second nature as a tester.

		if (timeFirst[0] < 0 || timeFirst[0] > 23) {
			System.out.println("time1 has invalid hour input"); return;
		}
		if (timeFirst[1] < 0 || timeFirst[1] > 59) {
			System.out.println("time1 has invalid minute input");return;
		}
		if (timeSecond[0] < 0 || timeSecond[0] > 23) {
			System.out.println("time2 has invalid hour input"); return;
		}
		if (timeSecond[1] < 0 || timeSecond[1] > 59) {
			System.out.println("time has invalid minute input");return;
		}
////////////////////////////////////////////////////////////////
//		double firstinput= timeFirst[0]+timeFirst[1]/60;
//		double secondinput= timeFirst[0]+timeFirst[1]/60;
//		System.out.println(firstinput+"  "+secondinput);
		
		if (timeFirst[0] > timeSecond[0]) {
			System.out.println("first time is later");
		} else if (timeFirst[0] < timeSecond[0]) {
			System.out.println("first time is earlier");
		} else if (timeFirst[0] == timeSecond[0] && timeFirst[1] > timeSecond[1]) {
			System.out.println("first time is later");
		} else if (timeFirst[0] == timeSecond[0] && timeFirst[1] < timeSecond[1]) {
			System.out.println("first time is earlier");
		} else
			System.out.println("time1 and time2 are same");
	}
}

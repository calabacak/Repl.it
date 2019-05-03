package day18_whiledowhileloops;

import java.util.Scanner;

public class Writeaprogramthatwillcomputestatisticsforeightcointosses {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numOfH = 0;
		int numOfT = 0;
		int n =0;
		
		System.out.println("enter H or T");
		
		char input = scan.next().charAt(0);
		
		while(n<=10) {
		
		if (input=='H') {
			numOfH = numOfH+1;
			
		}else if (input == 'T') {
			numOfT = numOfT+1;
		}
		
		System.out.println("enter H or T");
		
		input = scan.next().charAt(0);
		n= n+1;
		}
		System.out.println("num or Hs is = " +numOfH);
		System.out.println("num or Ts is = " +numOfT);
	}

}

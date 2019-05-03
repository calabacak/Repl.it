package day21;

import java.util.Scanner;

public class Practise3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
	
		do {
			System.out.println("enter first number");
			int num1=scan.nextInt();
			if(num1>100) {
				System.out.println("Good Number");
				return;
			}
			System.out.println("enter second number");
			int num2=scan.nextInt();
			
			sum = num1+num2;
			
		}while(sum<100);
		System.out.println("Good numbers, sum is " +sum);
		
	}

}

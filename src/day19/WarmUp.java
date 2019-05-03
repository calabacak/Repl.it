package day19;

import java.util.Scanner;

public class WarmUp {
	
	public static void main(String[] args) {
		
		double balance = 100.05;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How much is your balance");
		
		balance = scan.nextDouble();
		
//		System.out.println("How much do want to withdraw");
//		
//		double withdraw = scan.nextDouble();
		int count =0;
		
		while(balance>0) {
			
			System.out.println("How much do want to withdraw");
			
			double withdraw = scan.nextDouble();
			
			if(balance<withdraw) {
				
				System.out.println("no enough money try another amount");
			}else {
			
				count = count +1;
			balance = balance - withdraw;
			}
			
			System.out.println("Your made" + count +" transactions and current balance is "+ balance);
		}	
		
	}

}

package HomeWork;

import java.util.Scanner;

public class Print_multiplication_sheet {
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Input a number");
		int num = scan.nextInt();
		int multiply=1;
		
		for(int i=1; i<=10; i++) {
			
			multiply = i*num;
			
			//System.out.println("Input a number:");
			System.out.println(num + " x " + i + " = " + multiply);
		}
				
				
	}

}

package day11_logical_nestedif;

import java.util.Scanner;

public class HomeWork46 {
	public static void main(String[] args) {
		
	    int num, digit1, digit2, digit3, digit4, digit5;
	    //WRITE YOUR CODE HERE

	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your number:");
	    
	    num = scan.nextInt();
	    //System.out.println(num);
	    
	digit1 = num/10000;
	num = (num%10000);
	digit2 = num/1000;
	num = num%1000;
	digit3 = num/100;
	num = num%100;
	digit4 = num/10;
	num =num%10;
	digit5 = num;
	System.out.println(digit1);
	System.out.println(digit2);
	System.out.println(digit3);
	System.out.println(digit4);
	System.out.println(digit5);

		
	}

}

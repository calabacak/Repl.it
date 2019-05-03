package day11_logical_nestedif;

import java.util.Scanner;

public class HomeWork46V3 {
	public static void main(String[] args) {
		
	    int num, digit1, digit2, digit3, digit4, digit5;
	    int digit = 1;
	    int sum = 0;
	    //WRITE YOUR CODE HERE

	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your number:");
	    
	    num = scan.nextInt();
	    //System.out.println(num);
	    
while(digit>0) {
	digit= num%10;
	num=num/10;
	sum = sum +digit;
	    
}System.out.println("the sum of digits in "+ num +"is "+ sum);
	}
}

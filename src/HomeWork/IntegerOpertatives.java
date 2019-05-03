package HomeWork;

import java.util.Scanner;

public class IntegerOpertatives {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input 1st integer:");
		int a = scan.nextInt();
		System.out.println("Input 2nd integer:");
		int b = scan.nextInt();
		
		System.out.println("Sum of two integers: "+(a+b));
		
		System.out.println("Difference of two integers: "+(a-b));
		
		System.out.println("Product of two integers: "+(a*b));
		
		double average = (a+b)/2;
		System.out.println("Average of two integers: "+average);// double
		
		System.out.println("Distance of two integers: "+(a-b));
		
		if (a>b) {
		System.out.println("Max integer: "+a);//find it
		System.out.println("Min integer: "+b);// find it
		}else if(b>a) {
		System.out.println("Max integer: "+b);//find it
		System.out.println("Min integer: "+b);// find it
		}
		
		
		
	}

}
//Sum of two integers: 30
//Difference of two integers: 20
//Product of two integers: 125
//Average of two integers: 15.0
//Distance of two integers: 20
//Max integer: 25
//Min integer: 5
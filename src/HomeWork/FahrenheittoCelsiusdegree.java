package HomeWork;

import java.util.Scanner;

public class FahrenheittoCelsiusdegree {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a degree in Fahrenheit:");
		double input = scan.nextDouble();
		
		double output = (5*(input-32)/9);
		
		System.out.println(input+" degree Fahrenheit is equal to "+output+" in Celsius");
		
	}

}

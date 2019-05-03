package HomeWork;

import java.util.Scanner;

public class Numberininches {
	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a value for inch:");
		double input = scan.nextDouble();
		
		double output = input*0.0254;
		
		System.out.println(input+" inch is "+output+" meters");
		
		
	}

}
//Input a value for inch: 1000                                                                                  
//1000.0 inch is 25.4 meters

package day23_Arrays;

import java.util.Scanner;

public class ArrayPractice1 {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int [] myIntegers = getIntegers(3);	// first method named getIntegers
		
		printArray(myIntegers); 		// second method named printArray
		
		getAverage(myIntegers); // third method
		System.out.println("average of the numbers are = "+getAverage(myIntegers));
	}
	public static int[] getIntegers(int number) { // first method to creare an array.
		
		System.out.println("enter "+ number + " values");
		
		int [] values =  new int [number];
		
		for (int i = 0; i < values.length; i++) {
			
			values[i]= scan.nextInt();
			
		}
		return values;
	}
	
	public static void printArray(int [] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	
	}
	public static int getAverage(int [] scores) {
		
		int sum=0;
		for (int i = 0; i < scores.length; i++) {
			sum+=scores[i];
			
		}
		int average = sum/scores.length;
		return average;
	}
	

}

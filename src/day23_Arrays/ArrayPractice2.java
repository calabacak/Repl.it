package day23_Arrays;

import java.util.Scanner;

public class ArrayPractice2 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		int [] myArray = getIntegers(5); // calling method 1
	
		
		printArray(myArray);// calling method 2
		
		System.out.println("minumum value of the array is "+getMin(myArray)); // calling method 3
		
		
	}
	
	
	/////first method get int numbers and create an array
	
	public static int[]  getIntegers(int number) {
		
		System.out.println("enter " + number + " values");
		
		int [] values = new int [number];
		
		for (int i = 0; i < values.length; i++) {
			
			values[i]= scan.nextInt();
		}
	return values ;	
		
	}	
/////second method
	
	public static void printArray(int [] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		
	}
	
/////third method
	public static int getMin(int [] array) {
		
		int min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
			
		}return min;
	}
	
	
	
	
	
	
	

}

package day23_Arrays;

import java.util.Scanner;

public class ArrayPractice3 {
	private static Scanner scan = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		
		
		int [] myArray=getIntegers(5);
		pringArray(myArray);
		getMinValue(myArray);
		pringArray(getMinValue(myArray));
		System.out.println(myArray[0]);
		
		
	}
	
	public static int [] getIntegers(int number){
		int [] array = new int[number];
		System.out.println("enter" + number+ " values");
		for (int i = 0; i < number; i++) {
			array[i]= scan.nextInt();
		}
		return array;
	}
	
	public static void pringArray(int [] Array) {
		
		for (int i = 0; i < Array.length; i++) {
			
			System.out.println(Array[i]);
			
		}
		
	}
	
	public static int [] getMinValue(int [] Array) {
		int temp;
		for (int i = 0; i < Array.length; i++) {
			for (int j = i+1; j < Array.length; j++) {
				if(Array[j]<Array[i]) {
					temp=Array[j];
					Array[j]=Array[i];
					Array[i]=temp;
				}
				
			}
		}
		
		return Array;
	}
	
	
	
	
	
	
	
	
	
	

}

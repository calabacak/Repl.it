package day25_Arrays_in_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Practise_100_Arrays_printing_01 {
	public static void main(String[] args) {

//		The code provided in your main method will take in five Strings and save them into an array called arr.  
//		Print out the first three letter of each element of arr, one per line.  
//		You can assume that every element of arr is at least 3 letters long.
//
//		Example:
//		arr -> ["apple", "banana"] 
//		 prints: app
//		         ban

		Scanner scan = new Scanner(System.in);

		System.out.println("give me the length of the array");

		int length = scan.nextInt();

		int[] array = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.println("give me the value of the number " + (i + 1));
			array[i] = scan.nextInt();
		}

		String str = Arrays.toString(array);
		System.out.println(str);
		System.out.println("====================================");

		System.out.println("give me the length of the array");
		int lengthFruits = scan.nextInt();

		String[] fruits = new String[lengthFruits];

		for (int i = 0; i < lengthFruits; i++) {
			System.out.println("give me the name of the fruit " + (i + 1));
			fruits[i] = scan.next();
		}

		String str2 = Arrays.deepToString(fruits);

		System.out.println(str2);

		System.out.println("===========print out first 3 letters of the fruits=========");

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i].substring(0, 3));
		}

	}

}

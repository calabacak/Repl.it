package day27_arrays05;

import java.util.Arrays;

public class PractiseArrayList {
	public static void main(String[] args) {

		double[] prices = { 12.35, 23, 15, 4.69, 12, 66.69, 99 };

		System.out.println(Arrays.toString(prices));
		Arrays.sort(prices);
		
//		Arrays.sort(prices,1,4);
//		System.out.println(Arrays.toString(prices));
		
		String[] names = {"Adam", "Cengiz", "Bob", "David","Abi"};
		
		Arrays.sort(names);// 
		System.out.println(Arrays.toString(names));
		int pos= Arrays.binarySearch(names, "Bob");// the array must be sorted before and if the searched item is not there result will give the negative place it were there starting from 2
		System.out.println(pos);
		

	

		
		
		
		
		
		
	}

}

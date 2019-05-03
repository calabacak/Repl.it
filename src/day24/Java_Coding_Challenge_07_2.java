package day24;

import java.util.Arrays;

public class Java_Coding_Challenge_07_2 {
	public static void main(String[] args) {
		
//		Question 2:
//			Following code is given:
			int tableOf = 7;
			int [] arr = {1, 2, 3, 4, 5, 6, 7 ,8, 9, 10};
//			You are not allowed to declare any other variable, apart from declaration variable of for-each.
//			Write for-each loop to print following:
//			7 * 1 = 7
//			7 * 2 = 14
//			7 * 3 = 21
//			7 * 4 = 28
//			7 * 5 = 35
//			7 * 6 = 42
//			7 * 7 = 49
//			7 * 8 = 56
//			7 * 9 = 63
//			7 * 10 = 70
		
		
		for(int num:arr) {
			System.out.println(tableOf + "*"+ num+ " = "+ num*tableOf);
		}
		
		//System.out.println();
		
		////////////////////////////
		System.out.println("==================================");
//		Question 4:
//			Write a java program to accept more than 1 digit as command-line arguments and display the
//			highest digit to the user.
//			For example, if user passes 9, 14, 0, 23, 98, 2, 45
//			Output should be: Highest digit is: 98
		
		int [] nums = {9, 14, 0, 23, 98, 2, 45};
		
		int max =0;
		for(int i=0; i<nums.length; i++) {
			
			if (nums[i]> max){
				max=nums[i];
			}
		} System.out.println("Highest digit is: "+ max);
		
		System.out.println("=========================");
		System.out.println("max to min sorted");
		int temp;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > nums[i]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		for (int num : nums) {
			System.out.print(num + "\t");
		}

		System.out.println("=========================");
		System.out.println("conver to stiring");
		// int [] nums = {9, 14, 0, 23, 98, 2, 45};
		String str = Arrays.toString(nums);
		System.out.println(str);
		
		
		// lets try to draw a diamond;
		
		for (int i = 0; i <= 11; i++) {
			for (int j = 11; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 10; i >= 0; i--) {
			for (int j = 11; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		

	}

}

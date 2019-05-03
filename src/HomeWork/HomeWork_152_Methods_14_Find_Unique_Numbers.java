package HomeWork;

import java.util.Scanner;

public class HomeWork_152_Methods_14_Find_Unique_Numbers {
	/*
	 * Example: input:[2, 5, 5, 6, 3, 6, 9, 34, 3] output: 2 9 34
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] nums) {
		// WRITE YOUR CODE HERE
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(nums[i]);
			}
		}

	}
}

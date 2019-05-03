package HomeWork;

import java.util.Scanner;

public class HomeWork_114_Arrays_find_non_duplicate {
	public static void main(String[] args) {

//		Given an array nums with 7 integers every element is repeated twice - except one. 
//		Find that element and print it to console.

		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };

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
				return;
			}
		}
	}

}

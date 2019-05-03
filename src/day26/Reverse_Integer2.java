package day26;

import java.util.Arrays;

public class Reverse_Integer2 {
	public static void main(String[] args) {

//		Example 1:
//
//			Input: 123
//			Output: 321
//			Example 2:
//
//			Input: -123
//			Output: -321
//			Example 3:
//
//			Input: 120
//			Output: 21

//		Note:
//			Assume we are dealing with an environment which could only store 
//			integers within the 32-bit signed integer range: [−2^31,  2^31 − 1]. 
//			For the purpose of this problem, 
//			assume that your function returns 0 when the reversed integer overflows.

		// LETS FIRST FIND THE NUMBER OF DIGITS IN A GIVEN NUMBER
		int number = 12304;
		int numbers = number;
		int numOfDigs = 0;

		for (int i = number; i > 0; i = i / 10) {

			numOfDigs++;
		}
		System.out.println(numOfDigs);

		// NOW LETS FIND THE DIGITS OF THE NUMBER IN REVERSE ORDER
		int[] nums = new int[numOfDigs];

		for (int i = 0; i < nums.length; i++) {

			nums[i] = number % 10;

			number = number / 10;
		}

		System.out.println(Arrays.toString(nums));

		for (int num : nums) {
			if (num != 0) {
				System.out.print(num);
			}
			System.out.println("=========");
		}

		// AND NOW LETS MAKE IT A NUMBER AGAIN

		double rnum = 0;

		int valOfDig = 0;

		for (int i = nums.length - 1; i >= 0; i--) {
//			if(nums[i]==0) {
//				i--;
//				continue;
//			}
			rnum = rnum + nums[i] * Math.pow(10, nums.length - 1 - i);
		}
		System.out.println("=================");
		System.out.println("GIVEN NUMBER IS " + numbers + " and the output is " + rnum);

	}

}

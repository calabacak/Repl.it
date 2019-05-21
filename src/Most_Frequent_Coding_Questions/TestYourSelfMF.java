package Most_Frequent_Coding_Questions;

import java.util.*;

public class TestYourSelfMF {
	public static void main(String[] args) {

		int[] nums = new int[] { 1, 3, 5, 7, 9, 11, 13 };
		System.out.println("Before");
		System.out.println(Arrays.toString(nums));
		System.out.println("After");
		System.out.println(Arrays.toString(findReverse(nums)));

		findTriangle(6);

	}
	// write a method that will reverse the values in the array
	// result should be like [13,11,9,7,5,3,1]

	public static int[] findReverse(int[] arr) {

		int temp = arr[0];

		for (int i = 0; i < arr.length / 2; i++) {
			// swap data operation
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		return arr;
	}

	// write a method which wil be a decreasing triangle

	public static void findTriangle(int num) {

		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print("*");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("&");
			}
			System.out.println();
		}
		
	}

}

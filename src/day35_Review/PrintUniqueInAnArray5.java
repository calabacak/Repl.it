package day35_Review;

import java.util.Arrays;

public class PrintUniqueInAnArray5 {
	public static void main(String[] args) {

		int[] arr = { 7, 4, 1, 4, 1, 5, 9, 9, 3 };

		System.out.println(findUniqueNumber(arr));
	}

	public static int findUniqueNumber(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				int a= arr[i];
				System.out.println(arr[i]);
				
			}
		} 
		return 1;
	}
	
}

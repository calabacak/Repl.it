package day35_Review;

import java.util.Arrays;

public class PrintUniqueInAnArray {
	public static void main(String[] args) {

		int[] arr = { 7, 4, 1, 4, 1, 5, 9, 9, 3 };

		findUniqueNumber(arr);
	}

	public static void findUniqueNumber(int[] arr) {
		int count = 0;
		String str="";

		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				str+=arr[i]+", ";
			}
		} 
		System.out.println(str);
	}
	
}

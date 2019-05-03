package day35_Review;

import java.util.Arrays;

public class PrintUniqueInAnArray2 {
	public static void main(String[] args) {

		int[] arr = { 7, 4, 1, 4, 1, 5, 9,9, 3 };

		System.out.println(Arrays.toString(findUniqueNumber(arr)));
	}

	public static int[] findUniqueNumber(int[] arr) {
		int count = 0;

		// int[] narr = null;
		int[] narr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				narr[i] = arr[i];
			}
		}
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			if (narr[i] != 0) {
				size++;
			}
		}

		int[] newarr = new int[size];
		int k = 0;
		for (int i = 0; i < narr.length; i++) {
			if (narr[i] != 0) {
				newarr[k] = arr[i];
				k++;
			}

		}

		return newarr;
	}

}

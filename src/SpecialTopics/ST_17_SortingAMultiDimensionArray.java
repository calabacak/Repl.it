package SpecialTopics;

import java.util.Arrays;

public class ST_17_SortingAMultiDimensionArray {
	public static void main(String[] args) {

		// sort a multi dim array
		int[][] arr4 = new int[3][];
		System.out.println(arr4.length);
		// System.out.println(arr4[0].length);
		arr4[0] = new int[] { 23, 45, 67, 34, 89, 34, 99, 35, 45 };
		arr4[1] = new int[] { 36, 29, 73 };
		arr4[2] = new int[] { 2, 92, 56, 38, 46 };

		System.out.println(Arrays.deepToString(arr4));

		int temp = 0;
		for (int k = 0; k < arr4.length; k++) {
			for (int i = 0; i < arr4[k].length; i++) {
				for (int j = i + 1; j < arr4[k].length; j++) {
					if (arr4[k][j] > arr4[k][i]) {
						temp = arr4[k][j];
						arr4[k][j] = arr4[k][i];
						arr4[k][i] = temp;
					}
				}
			}

		}
		System.out.println(Arrays.deepToString(arr4));

	}

}

package Most_Frequent_Coding_Questions;

import java.util.Arrays;

public class MF_09_Remove_duplicates_from_array {

	public static void main(String[] args) {

		String[] str1 = { "apples", "orange", "apples", "banana", "grapes" };

		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(removeDuplicates(str1)));

	}

	public static String[] removeDuplicates(String[] arr) {

		int k = 0;
		int count = 0;
		String[] arrnew = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
				}

			}
			if (count != 2) {
				arrnew[i] = arr[i];
				k++;
			}
		}
		int m = 0;
		String[] result = new String[k];
		for (int i = 0; i < arr.length; i++) {
			if (arrnew[i] != null) {
				result[m] = arrnew[i];
				m++;
			}
		}
		return (result);
	}

}

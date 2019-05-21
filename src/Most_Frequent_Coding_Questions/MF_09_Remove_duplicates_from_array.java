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
	/////check this, 19 may seems more robust
	public static String[] removeDublicates(String[] fruits) {
		int size = 0;
		for (int i = 0; i < fruits.length; i++) {
			int count = 0;
			for (int j = 0; j < fruits.length; j++) {
				if (fruits[i].contentEquals(fruits[j]) && i != j) { //finding the unique element
					count++;
				}
			}
			if (count == 0) {
				size++;
			}
		}
		String[] arrnew = new String[size];
		int k = 0;
		
		for (int i = 0; i < fruits.length; i++) {
			int ncount = 0;
			for (int j = 0; j < fruits.length; j++) {
				if (fruits[i].contentEquals(fruits[j]) && i != j) {
					ncount++;
				}
			}
			if (ncount == 0) {
				arrnew[k] = fruits[i];
				k++;
			}
		}
		return arrnew;
	}

}

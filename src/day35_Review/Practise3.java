package day35_Review;

public class Practise3 {

	public static int[] findUniqueNums(int[] arr) {
		int size = 0;
		int[] newarr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				newarr[i] = arr[i];
				size++;
			}
		}
		// return newarr;

		int[] result = new int[size];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				result[k] = arr[i];
				k++;
			}
		}
		return result;
	}
}

package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class test227_2 {
	public static void main(String[] args) {

		int numberOfEntries = 5;
		int start = 5;

		ArrayList<Integer> list1 = new ArrayList<>();
		int[] arr = new int[numberOfEntries];
		int size = list1.size();

		while (size < numberOfEntries) {
			if (isPrime(start)) {
				list1.add(start);
				start++;
				size++;
				System.out.println(size);
			}
			start++;
		}

		for (int i = 0; i < numberOfEntries; i++) {
			arr[i] = list1.get(i);
		}
		System.out.println(Arrays.toString(arr));
		;
	}

	public static boolean isPrime(int number) {
		if (number <= 0 || number == 1) {
			return false;
		}

		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				return false;
			}
		}
		return true;
	}

}

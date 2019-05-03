package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_137_Arrays_Zombie_Attack_2V2 {
	public static void main(String[] args) {

		int[] arr = new int[] { 5, 0, 10, 14, 13, 10, 5 };
		int sum = 0;
		do {
			sum = 0;
			for (int i = 1; i < arr.length - 1; i++) {
				if (arr[i - 1] == 0 || arr[i + 1] == 0) {
					arr[i] = arr[i] / 2;
				}
				sum += arr[i];
				System.out.println(Arrays.toString(arr));
			}
			
		} while (sum != 0);

		System.out.println(Arrays.toString(arr));

	}
}
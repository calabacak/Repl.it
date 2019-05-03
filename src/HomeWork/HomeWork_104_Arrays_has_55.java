package HomeWork;

import java.util.Scanner;

public class HomeWork_104_Arrays_has_55 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 5 && nums[i + 1] == 5) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(false);
		} else
			System.out.println(true);
		System.out.println(count);
	}
}

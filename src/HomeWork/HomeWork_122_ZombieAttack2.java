package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_122_ZombieAttack2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		// TODO. Write you code below this line.

		int sum = 0;
		int k = 0;
		System.out.println("Day " + (k) + " "+Arrays.toString(inhabitants)); // day zero

		for (int i = 0; i < inhabitants.length; i++) {
			sum += inhabitants[i];
		}

		if (sum == 0) {
			System.out.println("---- EXTINCT ----");
			return;
		}
		k++;
		//System.out.println(sum);
		while (sum != 0) {
			sum = 0;
			for (int i = 0; i < inhabitants.length; i++) {
				inhabitants[i] = inhabitants[i] / 2;
				sum += inhabitants[i];
			}
			System.out.println("Day " + (k) + " "+Arrays.toString(inhabitants));
			k++;
			//System.out.println(sum);
		}
		System.out.println("---- EXTINCT ----");

	}
}

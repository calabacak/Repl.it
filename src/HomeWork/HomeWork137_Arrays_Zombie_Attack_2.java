package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork137_Arrays_Zombie_Attack_2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[] { 3, 6, 0, 4, 3, 2, 7, 0 };
//	    for(int i=0; i<inhabitants.length; i++) {
//	      inhabitants[i] = input.nextInt();
//	    }

		// TODO. Write you code below this line.

		int sum = 0;
		int k = 0;
		System.out.println("Day " + (k) + " " + Arrays.toString(inhabitants)); // day zero

		for (int i = 0; i < inhabitants.length; i++) {
			sum += inhabitants[i];
		}

		if (sum == 0) {
			System.out.println("---- EXTINCT ----");
			return;
		}
		k++;
		// System.out.println(sum);
		while (sum != 0) {
			sum = 0;
			for (int i = 0; i < inhabitants.length; i++) {
				if (i == 0 && inhabitants[1] == 0) {
					inhabitants[0] = inhabitants[0] / 2;
					sum += inhabitants[0];
					continue;
				} else if (i == 0 && inhabitants[1] != 0) {
					sum += inhabitants[0];
					continue;
				}
				if (i == inhabitants.length - 1 && inhabitants[inhabitants.length - 2] == 0) {
					inhabitants[inhabitants.length - 1] = inhabitants[inhabitants.length - 1] / 2;
					sum += inhabitants[inhabitants.length - 1];
					continue;
				} else if (i == inhabitants.length - 1 && inhabitants[inhabitants.length - 2] != 0) {
					sum += inhabitants[inhabitants.length - 1];
					continue;
				}
				
				else if ((inhabitants[i + 1] == 0 || inhabitants[i - 1] == 0)) {
					inhabitants[i] = inhabitants[i] / 2;
					
					
				}sum += inhabitants[i];
				//if(i==inhabitants.length-2)
				System.out.println("Day " + (k) + " " + Arrays.toString(inhabitants));
				
			}
		
			k++;

		}
		System.out.println("---- EXTINCT ----");

	}

}

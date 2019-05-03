package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_130_Arrays_Diving {
	public static void main(String[] args) {
		/*
		 * In the sport of diving, seven judges award a score between 0 and 10, where
		 * each score may be a floating-point value. The highest and lowest scores are
		 * thrown out, and the remaining scores are added together. The sum is then
		 * multiplied by the degree of difficulty for that dive. The degree of
		 * difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6
		 * to determine the divers score.
		 */

		Scanner input = new Scanner(System.in);
		float[] score = new float[7];
		double total;
		float dif;
		// WRITE YOUR CODE HERE

		for (int i = 0; i < 7; i++) {
			System.out.println("Enter score for judge "+(i+1)+":");
			score[i] = input.nextFloat();
		}
		Arrays.sort(score);

		// System.out.println(Arrays.toString(score));

		int sum = 0;

		for (int i = 1; i < 6; i++) {
			sum += score[i];
		}
		
		System.out.println("Enter difficulty:");
		dif= input.nextFloat();
		
		total=sum*dif*0.6;
				
		// FINAL OUTPUT
		System.out.printf("Total: %.2f", total);
		/*
		 * 1
5
5
5
5
8
9
2.1
		 */

	}
}

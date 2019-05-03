package day24;

import java.util.Arrays;

public class PractiseTwoDimensional2 {
	public static void main(String[] args) {

		int[][] numbers = { { 90, 10, 231 }, { -20, 80, 100, 23, 54 }, { 45, 22 }, { 87, 98, -100, 49, 73, 35, 19 } };

		int nubOfElements = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				nubOfElements++;
			}
		}
		//System.out.println(nubOfElements);

		int[] oneDimensinal = new int[nubOfElements];
		int k = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				oneDimensinal[k] = numbers[i][j];
				k++;
			}
		}System.out.println(Arrays.toString(oneDimensinal)); //print array without loop;
		System.out.println("============================");

		for(int one: oneDimensinal) {
			System.out.print(one+"-");
		}

	}

}

package SpecialTopics;

public class ST_23_FindMaxNumberIn2DArray {
	public static void main(String[] args) {

		int[][] numbers = { { 90, 10, 231 }, { -20, 80, 1009, 23, 54 }, { 45, 22 }, { 87, 98, -100, 49, 73, 35, 19 } };
		// Write logic to find out highest number in above array.

		int max = numbers[0][0];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {// bravo cengiz you come up with numbers[i].length
				if (numbers[i][j] > max) {
					max=numbers[i][j];
				}
			}
		}
		System.out.println(max);
	}
}

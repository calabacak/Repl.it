package day24;

import java.util.Scanner;

public class findmaxvalueina2darray {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		//////////////////// creating a 2d array
		int rows = inp.nextInt(); // number of rows
		int cols = inp.nextInt(); // number of columns

		int[][] arr = new int[rows][cols]; // declaring the arr array with the input

		for (int i = 0; i < rows; i++) { // assigning the values
			for (int j = 0; j < cols; j++) {
				arr[i][j] = inp.nextInt();
			}
		} // now I have a rowXcolumns array with the values in it

		// lets print it out to see our arr, enhanced loop for 2 d arrays:///////

		for (int[] num : arr) {
			for (int n : num) {
				System.out.print(n+"\t");
			}
		}System.out.println();
		////////////////////////////////////////
		int max = arr[0][0]; // initialize max value. declare a max value and assign the first value in it;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) { // take every value and check with each other one by one, sliding to right..
					max = arr[i][j]; // if it larger place it in max basket and keep checking
				}
			}
		}
		System.out.println("Max value is = " + max);

	}

}

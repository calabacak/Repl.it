package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_137_2D_Arrays_Largest_number_2 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			} // end for cols
		} // end for rows

		//System.out.println(Arrays.deepToString(arr));

		int max = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = max;
			}
		}
		System.out.println(Arrays.deepToString(arr));

	}

}

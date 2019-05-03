package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_136_2D_Arrays_Diagonal_Differenc {
	public static void main(String[] args) {

		/*
		 * 
		 * 136. 2D Arrays - Diagonal Differenc Given a square matrix, calculate the
		 * absolute difference between the sums of its diagonals. For example, the
		 * square matrix is shown below: 1 2 3 4 5 6 9 8 9
		 * 
		 * The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal = 3+5+9 =
		 * 17. Their absolute difference is |15-17| = 2.
		 */

		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[][] { { scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };
		int result = 0;
		int resultr = 0;
		int resultl = 0;

		for (int i = 0; i < matrix.length; i++) {

			resultr += matrix[i][matrix.length - 1 - i];
		}
		// System.out.println(Arrays.deepToString(matrix));
		// System.out.println(resultr);

		for (int i = 0; i < matrix.length; i++) {

			resultl += matrix[i][i];
		}

//		    System.out.println(Arrays.deepToString(matrix));
//		    System.out.println(resultl);

		result = resultr - resultl;

		// FINAL PRINT
		System.out.println(Math.abs(result));

	}

}

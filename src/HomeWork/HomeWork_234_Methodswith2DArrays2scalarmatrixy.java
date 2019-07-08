package HomeWork;

import java.util.Arrays;

public class HomeWork_234_Methodswith2DArrays2scalarmatrixy {
	public static void main(String[] args) {

		int[][] i = new int[][] { { 1, 1, 1 }, { 1, 1, 1 } };
		i = scalar(i, 2);
		System.out.println(Arrays.deepToString(i));

		// end main
	}

	public static int[][] scalar(int[][] matrix, int n) {

		//int[][] result = new int[matrix.length][];
		int[][] result = Arrays.copyOf(matrix, matrix.length);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				result[i][j] = matrix[i][j] * n;
			}
		}

		return result;

	}

}

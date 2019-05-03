package HomeWork;

import java.util.Arrays;

public class HomeWork_133_Declare_3D {

	public static void main(String[] args) {
		
		/*
		 * Declare, create, and initialize a three-dimensional array of ints called values, 
		 * that has 3 rows, each of which has 2 columns where each column is an array 4 ints. 
The elements in the first row are all 5, in the second row are all 7, 
and in the third row the first column is all 8 and the second column is 30, 31, 32, and 33
Three dimensional array:
int[][][] threeD_arr = new int[3][2][4];
int[][][] arr = new int[10][20][30];
		 */
				
		int[][][] values = { {{5,5,5,5}, {5,5,5,5}}, {{7,7,7,7}, {7,7,7,7}},{{8,8,8,8}, {30,31,32,33}} };	

		System.out.println(Arrays.deepToString(values));
	}

}

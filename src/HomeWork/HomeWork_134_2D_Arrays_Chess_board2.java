package HomeWork;

import java.util.Arrays;

public class HomeWork_134_2D_Arrays_Chess_board2 {
	public static void main(String[] args) {
		/*
		 * Given a 8x8 two-dimensional array of strings named chessboard. 
		 * Initialize values inside an array accordingly to the chess board. 
		 * So first element in the array, chessboard[0][0] should have a value "1a", 
		 * and last element in the array, chessboard[7][7] should have a value "8h".
		 */
		String [][] chessBoard = new String[8][8];
		char ch='a';
		for(int i=0; i<=7; i++) {
			ch='a';
			for(int j=0; j<=7; j++) {
				if(j==7) {
					chessBoard[i][j]=(i+1)+""+ch;	
				}else
					chessBoard[i][j]=(i+1)+""+ch;	
				ch++;
			}
		}
		System.out.println(Arrays.deepToString(chessBoard));
	}

}

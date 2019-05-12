package day37_ArrayList;

import java.util.Arrays;

public class Multip_8x8 {
	public static void main(String[] args) {
		
		int [][] arr= new int[8][8];
		
		for(int i=0;i<=7;i++) {
			for(int j=0; j<=7; j++) {
				System.out.print((j+1)+i*8+"\t");
				arr[i][j]= (j+1)+i*8;
			}
			System.out.println();
		}
		///first choice...
		System.out.println(Arrays.deepToString(arr));
		//or......
		int i=1;
		for(int [] a: arr) {
			for(int b:a) {
				System.out.print(b+"\t");
				if(b==i*8) {
					System.out.println();
					i++;
				}
			}
		}
	}

}

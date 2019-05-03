package day28_multid_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMatchingNumbersIn2D {
	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		int row = scan.nextInt();
//		int col = scan.nextInt();
//
//		int[][] nums = new int[row][col];
//
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				nums[i][j] = scan.nextInt();
//			}
//		}
//		System.out.println(Arrays.deepToString(nums));
////		int count = 0;
////		for (int i = 0; i < row; i++) {
////			for (int j = 0; j < col - 1; j++) {
////				if (nums[i][j] == nums[i][j + 1]) {
////					count++;
////				}
////			}
////		}
//
//		// find the max number in a multi dimension array
//		int max=0;
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				if (nums[i][j] > max) {
//					max=nums[i][j];
//				}
//			} 
//		} System.out.println(max);
		
		
		// sort a one dimension array
//		int temp=0;
//		int [ ] arr = {23,45,67,34,89,34,99,35,45};
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[j]>arr[i]) {
//					temp=arr[j];
//					arr[j]=arr[i];
//					arr[i]=temp;
//				}
//			} 
//		} System.out.println(Arrays.toString(arr));
		
		// sort a multi dim array
		int [][] arr4= new int[3][];
		System.out.println(arr4.length);
		//System.out.println(arr4[0].length);
		arr4[0] = new int []{23,45,67,34,89,34,99,35,45};
		arr4[1] = new int []{36,29,73};
		arr4[2] = new int []{2,92,56,38,46};
		
		System.out.println(Arrays.deepToString(arr4));	
		
		int temp =0;
		for(int k=0; k<arr4.length; k++) {
			
			for(int i=0; i<arr4[k].length; i++) {
				for(int j= i+1; j<arr4[k].length; j++) {
					if(arr4[k][j]>arr4[k][i]) {
						temp=arr4[k][j];
						arr4[k][j]=arr4[k][i];
						arr4[k][i]=temp;
					}
				}
			}

		}
		System.out.println(Arrays.deepToString(arr4));	
		
		
		
		

		
	}// end main
}

package day28_multid_Arrays;

import java.util.Arrays;

public class Practise1MultiDimension {
	public static void main(String[] args) {
		
		String [][] teams= new String[2][6];
		
		int [][] scores= {{3,5,10},{6,4,2,10,15}};
		
//		System.out.println(scores.length);
//		System.out.println(scores[0].length);
//		System.out.println(scores[1].length);
//		
		int[][] values = new int[4][];
		
		values[0]= new int[] {34,23,14};
		
		values[1]= new int[] {134,233,154,24,68};
		
		values[2]= new int[] {13,283};
		
		values[3]= new int[] {713,8283,57,89,98,4159};
		System.out.println(Arrays.deepToString(values));
		
		System.out.println(values.length);
		
		
		for(int i=0; i<values.length;i++) {
			
			System.out.println("length of row "+(i+1)+" is "+values[i].length);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

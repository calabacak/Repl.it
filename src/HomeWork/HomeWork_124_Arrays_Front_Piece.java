package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_124_Arrays_Front_Piece {
	public static void main(String[] args) {
		
//		Given an int array of any length, print a new array of its first 2 elements. 
//		If the array is smaller than length 2, use whatever elements are present.
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(num));
		//WRITE YOUR CODE HERE
		int newsize;
		if(size>=2) {
			 newsize=2;
		}else newsize=size;
		
		int [] newnum= new int[newsize];
		
		for(int i=0; i<newsize;i++) {
			newnum[i]=num[i];
		}
		
		System.out.println(Arrays.toString(newnum));

  }
}
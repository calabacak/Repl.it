package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_135_Arrays_Shift_Left {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
	
		}
		//System.out.println(Arrays.toString(nums));
		// WRITE YOUR CODE HERE
		int k =  nums[0];
		for (int i = 0; i < nums.length-1; i++) {
			
			nums[i] = nums[i+1];
		}
		nums[nums.length - 1] = k;
		
		System.out.println(Arrays.toString(nums));
	}

}

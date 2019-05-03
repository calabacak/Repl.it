package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_118_Arrays_Reverse_Array {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: write your code below
	    int temp;

			for (int i = 0; i < nums.length / 2; i++) { // dont forget to divide by two;
				temp = nums[i];
				nums[i] = nums[nums.length - 1 - i];
				nums[nums.length - 1 - i] = temp;
	    
			}
	    //Do not change below statement:
	    System.out.println(Arrays.toString(nums));
	    
	  }
	}
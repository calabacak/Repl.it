package day19;

import java.util.Scanner;

public class savitchbook {
	public static void main(String[] args) {
		
		int [] nums = new int [5];
		Scanner scan = new Scanner(System.in);
		
		for(int i =0; i<nums.length;i++ ) {
		nums[i]= scan.nextInt();
		}
		for(int element:nums) {
			System.out.print("[ "+(element-nums[4])+" ]");
		}
		
		
		
		}
}



//WriteacompleteJavaprogramthatreads20valuesoftypedoublefromthe keyboard into an array. 
//Display the last (20th) number read. Then display the numbers in the array and 
//how much each number differs from the 20th number read. For example, 
//if the last value typed by the user is 5.0, 
//the difference between the array element 2.0 and 5.0 is −3.0. 
//If an array element is 7.0, the difference is 2.0. 
//Assume that the user enters 20 numbers, 
//one per line, at the keyboard. You need not give elaborate instructions to the user.
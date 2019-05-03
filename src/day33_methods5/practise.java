package day33_methods5;

import java.util.Arrays;

public class practise {
	public static void main(String[] args) {
		
		int nums []= {3,5,7,9,32,56,88,23};
		
		int [] original = nums;
		
		int [] original2= Arrays.copyOf(nums, 10);
		int [] original3= Arrays.copyOfRange(nums, 2, 5);
				
				
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(original2));
		System.out.println(Arrays.toString(original3));
		
		String str="cengiz alabacak";
		
		
		
	}
	
	

}

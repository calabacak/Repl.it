package day34_methods6;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		
		int [] nums= {23,6,78,97,45,34,23,563,23,47};
		int num=23;
		int result=CountArray.findOccurences(nums, num);
		
		//System.out.println(result);
		
		System.out.println(Arrays.toString(ArrayGet.getArray()));
		
		String a= "cengiz";
		System.out.println(a.substring(6));
	}


}

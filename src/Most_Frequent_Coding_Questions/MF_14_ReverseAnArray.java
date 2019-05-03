package Most_Frequent_Coding_Questions;

import java.util.Arrays;

public class MF_14_ReverseAnArray {
	public static void main(String[] args) {
		
		int [] arr= {4,6,8,9,2,4};
		
		System.out.println("======Before========");
		System.out.println(Arrays.toString(arr));
		System.out.println("======After========");
		System.out.println(Arrays.toString(reverseArray(arr)));
		
	}
	
	
	public static int [] reverseArray(int [] arr) {
		
		int temp;
		
		for(int i=0; i<arr.length/2; i++) {
			
			temp= arr[i];
			arr[i]= arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		
		return arr;
	}
	

}

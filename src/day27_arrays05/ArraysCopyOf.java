package day27_arrays05;

import java.util.Arrays;

public class ArraysCopyOf {
	public static void main(String[] args) {
		
		double [] d1 = {2.3, 4,5, 12,4};
		
		double [] d2=d1;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		
		
		d1[0]=100033;
		
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		
		//copy of creates a new object
		
		double [] d3= Arrays.copyOf(d2, d2.length);
				System.out.println(Arrays.toString(d3));
		
	}

}

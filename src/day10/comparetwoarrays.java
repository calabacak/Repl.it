package day10;

import java.util.Arrays;

public class comparetwoarrays {
	public static void main(String[] args) {
		int [] num1 = {12,23,2,78};
		int [] num2 = {2,12,23,78};
		
		Arrays.parallelSort(num1);
		Arrays.parallelSort(num2);
		
		//Assert.assertArrayEquals(num1,num2);
		
		num1 = Arrays.copyOf(num1, 7);
		num1[5] = 9;
		num1[6] = 19;
		num1[4] = 29;
		for (int i=0; i<=num1.length-1; i++) {
			System.out.println(num1[i]);
		}
		
		
	}

}

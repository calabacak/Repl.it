package SpecialTopics;

import java.util.Arrays;

public class ST_09_FibanocciNumber {
	public static void main(String[] args) {

		int[] Fibanocci = new int[9];

		Fibanocci[0] = 0;
		Fibanocci[1] = 1;

		for (int i = 2; i < Fibanocci.length; i++) {
			Fibanocci[i] = Fibanocci[i - 1] + Fibanocci[i - 2];
		}
//		for (int num : Fibanocci) {
//			System.out.println(num);
//		}
		System.out.println(Arrays.toString(Fibanocci));
		System.out.println(findFib(9));
		
	}
	
	public static int findFib(int num) {
		
		int fib1=0;
		int fib2=1;
		int Fibonacci=0;
		
		if(num==0) {
			return fib1;
		}else if(num==1) {
			return fib2;
		}else {
			
			for(int i=2; i<num;i++) {
				Fibonacci=fib1+fib2;
				fib1=fib2;
				fib2=Fibonacci;
				
			}
			
			return Fibonacci;
			
			
			
		}
	}

}

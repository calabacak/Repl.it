package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_155_Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		fib(num);
		
		////////////
		/* 
		 * let us solve this problem by arrays, in this case I need to see whole numbers as well
		 *
		 */
		
		// declare an array size num+1, because i want to see the fibonacci value for number zero as well
		
		
		int [] arrfib= new int[num+1];
		
		// assign the first 2 values
		
		arrfib [0]= 0;
		arrfib [1]=1;
		arrfib [2]=1;
		
		for(int i=3; i<arrfib.length; i++) {
			arrfib[i]= arrfib[i-1]+arrfib[i-2];
		}
		System.out.println(Arrays.toString(arrfib));
		
	}

	public static void fib(int num) {
		// WRITE YOUR CODE HERE

		if(num==0) {
			System.out.println(0);
		}
		else if (num == 1 || num == 2) {
			System.out.println(1);
		}
		else {
		int fibonacci = 0;
		int fib1 = 1;//fib1=0;
		int fib2 = 1;

		for (int i = 3; i <= num-1; i++) { //i<==num

			fibonacci = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibonacci;
		}
		System.out.println(fibonacci);
		}
		
		
	
	}
}

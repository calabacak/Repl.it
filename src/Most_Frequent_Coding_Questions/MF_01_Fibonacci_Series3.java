package Most_Frequent_Coding_Questions;

import java.util.Arrays;

public class MF_01_Fibonacci_Series3 {
	public static void main(String[] args) {

		getFibonacci(12);
	}

//without arrays
	public static void getFibonacci(int nums) {

		int fib1 = 1;
		int fib2 = 1;
		if (nums == 1) {
			System.out.println(1);
		}else if(nums == 2) {
			System.out.println(1);
			System.out.println(1);
		}

		else {
			System.out.println(1);
			System.out.println(1);
			for (int i = 3; i <= nums; i++) {
				int fibonacci = fib1 + fib2;
				System.out.println(fibonacci);
				fib1 = fib2;
				fib2 = fibonacci;
			}

		}

	}
	

}

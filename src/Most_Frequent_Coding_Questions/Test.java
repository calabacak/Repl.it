package Most_Frequent_Coding_Questions;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		// System.out.println(findFibo1(13));
		// System.out.println(isPrime(37));
		System.out.println(findPrimeNumbers(12));

	}

	public static int findFibo1(int num) {
		ArrayList<Integer> seri = new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList<>();

		int fib0 = 0;
		int fib1 = 1;
		seri.add(fib0);
		seri.add(fib1);
		nums.add(0);
		nums.add(1);

		if (num == 0) {
			return fib0;
		} else if (num == 1) {
			return fib1;
		} else {
			int fibonacci = 0;
			for (int i = 2; i <= num; i++) {
				fibonacci = fib1 + fib0;
				fib0 = fib1;
				fib1 = fibonacci;
				seri.add(fibonacci);
				nums.add(i);
				// System.out.println(fibonacci);
			}
			System.out.println(nums);
			System.out.println(seri);
			return fibonacci;
		}
	}

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static ArrayList findPrimeNumbers(int num) {
		ArrayList<Integer> prime = new ArrayList<>();

		for (int i = 2; i <= num; i++) {
			int count = 0;
			for (int j = 1; j <= num; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				prime.add(i);
			}
		}
		return prime;
	}
	

}

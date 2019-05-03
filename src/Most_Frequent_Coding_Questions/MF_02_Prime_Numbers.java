package Most_Frequent_Coding_Questions;

public class MF_02_Prime_Numbers {
	/*
	 * i find the sqrt of the number and check if the number is divisible by number from 2 to sqrt of the number 
	 */

	public static boolean isPrime(int number) {
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) { // number is perfectly divisible - no prime
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		// System.out.println(isPrime(4));
		System.out.println(isPrimeOrNot(11));
//		int a = (int)(Math.sqrt(7));
//		System.out.println(a);
	}
/////////////square of the number -1divisible by 24 or not;
	public static String isPrimeOrNot(int num) {
		if (num < 0) {
			return "not valid";
		}
		if (num == 0 || num == 1) {
			return "not prime";
		}
		if (num == 2 || num == 3) {
			return "prime number";
		}
		if ((num * num - 1) % 24 == 0) {
			return "prime";
		} else {
			return "not prime";
		}
	}
}

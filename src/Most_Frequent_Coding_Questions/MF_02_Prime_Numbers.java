package Most_Frequent_Coding_Questions;

import java.util.ArrayList;

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
		System.out.println(isPrimeOrNot(25));
//		int a = (int)(Math.sqrt(7));
//		System.out.println(a);
	}
/////////////square of the number -1divisible by 24 or not; not working for 35, 25:(
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
	public static ArrayList findPrimeNumbers(int num) {
		ArrayList<Integer> prime= new ArrayList<>();
		
		for(int i=2; i<=num; i++) {
			int count=0;
			for(int j=1; j<=num; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
			prime.add(i);
			}
		}
		
	return prime;
		
	}
	///////////////////////////// the best may 19 2019
	public static boolean isPrimeNumber(int num) {

		// if divisible by 1 and by itself;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	/////////////////ArrayList may 19 2019;
	
	public static ArrayList<Integer> isPrimeNumberv2(int num) {

		// if divisible by 1 and by itself;

		ArrayList<Integer> plist = new ArrayList<>();
		ArrayList<Integer> notplist = new ArrayList<>();

		for (int i = 2; i < num; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				plist.add(i);
			}else {
				notplist.add(i);
			}
		}
System.out.println(notplist);
return plist;
	}
}

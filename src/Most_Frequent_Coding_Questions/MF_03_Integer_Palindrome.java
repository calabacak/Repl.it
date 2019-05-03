package Most_Frequent_Coding_Questions;

public class MF_03_Integer_Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(12210));
		System.out.println(PisPalindrome(1221));

	}

	public static boolean isPalindrome(int number) {

		int reverse = 0;
		int n = number;
		while (n != 0) {
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}

		if (reverse == number) {
			return true;
		}
		return false;
	}

	///////////
	public static boolean PisPalindrome(int number) {
		int palindrome = number; // copied number into variable
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		// if original and reverse of number is equal means
		// number is palindrome in Java
		if (number == reverse) {
			return true;
		}
		return false;
	}

}

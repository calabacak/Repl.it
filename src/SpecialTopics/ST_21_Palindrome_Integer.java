package SpecialTopics;

public class ST_21_Palindrome_Integer {
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(12165));

	}

	public static boolean isPalindrome(int num) {

		String str = String.valueOf(num);
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {//be careful about i--
			reversed = reversed + str.charAt(i);// be careful how to concatenate
		}
		if (reversed.equals(str)) {
			return true;
		} else
			return false;
	}

}

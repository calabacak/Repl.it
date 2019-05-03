package day16_string_manipulation;

public class Trimming {
	public static void main(String[] args) {
		String str = "  \nCore Java   \t ";
		/*
		 * TODO: Write code to:
		 * 1. trim leading and trailing whitespace from above string and then
		 * 2. convert the all the characters of the trimmed string to upper case and finally
		 * 3. print the character value at index 2 of upper case String.
		 */
		//System.out.println("  \nCore Java   \t ");
		
		String strTrim = str.trim().toUpperCase();
		System.out.println(strTrim);
		System.out.println(strTrim.charAt(2));
		
	}
}


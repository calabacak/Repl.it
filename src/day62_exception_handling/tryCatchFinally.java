package day62_exception_handling;

public class tryCatchFinally {
	public static void main(String[] args) {

		String str = "Selenium";

		try {
			System.out.println(str.length());
			System.out.println(str.charAt(10));

		} catch (Exception e) {
			System.out.println("enter correct index");
			return;//Even if I have a return in my code, code in finally block will run anyway.

		} finally {

			System.out.println("finally block");
		}
			System.out.println("After try catch finally block");
	}

}

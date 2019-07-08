package day62_exception_handling;

public class TryCatch {
	public static void main(String[] args) {
		
		try {
			String str="Java";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));// not a compiler error but runtime error
		System.out.println(str.charAt(1));
		}catch(Exception e) {
			System.out.println("Exception happened in try block and was caught");
			System.out.println(e);
			
		}
		
		System.out.println("After try catch block");
		
		
	}

}

package day62_exception_handling;

public class ExceptionInCatch {
	public static void main(String[] args) {
		String str = "10j";
		
		try {
		int n = Integer.parseInt(str);//NumberFormatException
		System.out.println(n);
		}catch(NumberFormatException e) {
			System.out.println(str.charAt(10));
			System.out.println("hello from the Catch Block");
		}finally {
			System.out.println("Hello from Finally Block");
			
		}
		
		System.out.println("Bye Bye");
	}

}

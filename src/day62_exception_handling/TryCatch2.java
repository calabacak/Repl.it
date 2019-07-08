package day62_exception_handling;

public class TryCatch2 {
	
	public static void main(String[] args) {
		int [] nums = {34,46,23,48};
		try {
		System.out.println(nums[10]);	
		}catch(Exception e) {
			System.out.println("inside catch");
			//System.out.println(e.toString());
		}
		
		System.out.println("after try and catch blok");
		
		try {
			int j =100;
			int n=j/0;//Arithmetic exception
			System.out.println(n);	
		}catch(ArithmeticException e) {
			System.out.println("cannot / by zero");
			e.printStackTrace();// * Prints this throwable and its backtrace to the specified print stream.
		}
		
		System.out.println("AFTER try AND catch BLOCK");
	}

}

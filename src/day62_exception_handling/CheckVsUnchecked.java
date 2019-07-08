package day62_exception_handling;


public class CheckVsUnchecked {
	public static void main(String[] args) {
		//checked exception - interruptedException 
		//Two options: handle or declare
		// for the code to compile; we need to handle (try catch finally)or declare 
		try {
			System.out.println("Sleeping");
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println("Thread is interrupted");
		}
		System.out.println("wake up");
		
//		URL url = new URL("https://google.com");
	}

}

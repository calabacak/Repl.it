package OPPsCengiz;

public class DivByZero {
	public static void main(String[] args) {
		method1();	
		System.out.println("main ends.");
	}
	
	public static void method1() {
		int i=0;
		try {
			System.out.println(23/i);
		}catch(RuntimeException e) {
			//System.out.println("Can't divide by zero");
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println(e);
		}
		
	}

}

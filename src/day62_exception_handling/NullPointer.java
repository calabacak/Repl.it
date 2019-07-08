package day62_exception_handling;

public class NullPointer {
	static String name;
	
	public static void main(String[] args) {
		
		try {
			System.out.println(name);
		System.out.println(name.toUpperCase());
		}catch(NullPointerException e) {
			System.out.println("inside the catch block");
			System.out.println("the message: "+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Outside the catch block");
		
	}

}

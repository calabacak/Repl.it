package day63_exception_handling_2;

public class TryWithFinally {
	public static void main(String[] args) {
		//Don't use it in real coding
		try {
			System.out.println("In Try block");
			System.out.println(10/0);
		}finally {
			System.out.println("In Finally");
		}
		
		System.out.println("After try finally");
	}
}

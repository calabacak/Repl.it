package day54_inheritance_Review;



class parent{
	static int num1;   // class variable , inheritable
			int num2; // instance variable
	
	public void method1() {   // instance method
		
	}
	
	public static void method2() {   // static method
		System.out.println("Method2");
	}
	
	parent(){    // constructor  ,  cannot be inherited
		System.out.println("Constructor");
	}
	
	static {    // belongs to the class(runs only once when class is loaded, run)
		System.out.println("Static block");
	}
	
	{     // belongs to the object (runs each time object is created)
		System.out.println("Intance block");
	}
	
	private void methodB() {  // private is not inheritable, cannot be visible outside the class.
		
	}
	
	
	/* 
	  features that cannot be inherited:  1. constructor
										  2. features that are not visible:
										   			1. private AM.
										   			2. default AM (when sub class and super class are not in same package).
										  
										   3. abstract method (if sub class is not abstract)
										   			
										   */
	private int students=1000;
	
	
	
}

class class3 extends parent{
	private int students=1000;
	
}

public class InheritanceReview extends parent {
		// 	sub							super
	
// sub class can only have one super class. super class can have multiple sub classes
	// final class cannot be extended 
	public static void main(String[] args) {
//		System.out.println( num1 );
//		System.out.println(	new InheritanceReview().num2 );
//		System.out.println( new parent().num2 ); 
//			method2();
		new InheritanceReview();
		
		
	}
	public void methodA() {
		num2=300; 
	}
	
	
	
	
}

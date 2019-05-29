package day52_inheritance05;

public class FinalMethods {
	public final void method1() {
		
		//can not be overridden but can be overloaded
		System.out.println("Final Method 1");
	}
	
	class Sub extends FinalMethods{
		//can not b
		
//		public final void method1() {
//			System.out.println("Final Method 1");
//		}
//		
	}

}

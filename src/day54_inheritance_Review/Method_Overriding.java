package day54_inheritance_Review;

class superclass{
	
	public void original() {
		System.out.println("cybertek");
	}
	
	public static void method() {
		
	}
	public static void method(int a) {
		
	}
	
	 protected void method1() {
		
	}
	
	
}



public class Method_Overriding extends superclass{
	
	//   void method1() {   }  // Access modifier needs to be same or more visible
	
		public static void method(int a) {
				
			}
	
		@Override // checks if the method is being override
		public void original() {
				System.out.println("Batch 11");
			}
	
		public static void main(String[] args) {
			new superclass().original();
			new Method_Overriding().original();
		}
	/*
	 Method Overriding:  only instance methods can be override
	 			method needs to be override in subclass
	 			parameter MUST be same 
	 			@override should be applicable
	 			
	 		
	 
	 Method override vs method overload:
	 		method_override: MUST have same signature
	 						can not be override in same class
	 						return type needs to be the same
	 						Access modifier needs to be same or more visible
	 						only instance methods (does not have final and private) can be override
	 						
	 						
	 		
	 		method overload: Must have different parameter
	 					can be overload in same class
	 					return type can be same or different
	 					Access modifier can be different
	 					any methods and constructor can be overload
	 					
	 
	 */

}

package day54_inheritance_Review;

class data1{
	private String password ="123456";
	private final int age= 40;
	
	public String getPassword() {
		return password;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setPassword( String password ) {
		this.password = password;
	}
	
//	public void setAge(int age) {     final variable CANNOT have setter
//		this.age = age;
//	}
	
}


public class finalKeyword {
	

	/*
	 final:  value cannot be changed
	 		 *variable, *class and *methods
	 		 
	 		 *variable: 
	 		 		1. final local variable: does not need to be initialized immediately
	 		 							cannot be re-assigned.
	 		 		2. 	final instance variable: needs to be initialized 	immediately
	 		 							can be initialized in either instance block or constructor 
	 		 		
	 		 		3.  final static variable: needs to be initialized immediately
	 		 							can be initialized ONLY in static block
	 		 							
	 		 *class : class cannot extended,
	 		 			abstract class cannot be final.
	 		 
	 		 *method: cannot be overridden
	 
	 */
	
	 final String name;//instance variable
	 
	 {
	//	 name = "Batch 11";
	 }
	public finalKeyword() {//constructor
		name="Batch 13"; 
	} 
	
	final static String school;//static variable
	
	static { //Static Block
		school ="Cybertek";
	}
	
	
	
	public static void main(String[] args) {
		final boolean result;
		//	result = true;   final variable cannot be re-assigned
		
		
	}// break till 
}




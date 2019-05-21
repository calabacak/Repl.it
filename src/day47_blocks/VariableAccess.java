package day47_blocks;

public class VariableAccess {
	
	// instance variable
	int myInstanceVar=40;
	
	// static variable
	
	static int myStaticVar=55;
	
	public static void main(String[] args) {
		
		//System.out.println(myInstanceVar);// main method is static cannot access non static
		System.out.println(myStaticVar);
		
		
		// create an object then we can access to non static variable
		
		VariableAccess v = new VariableAccess();
		
		System.out.println(v.myInstanceVar);
		System.out.println(v.myStaticVar);
		System.out.println(VariableAccess.myStaticVar);
		
	}

}

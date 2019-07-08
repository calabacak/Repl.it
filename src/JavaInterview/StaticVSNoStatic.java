package JavaInterview;

public class StaticVSNoStatic {
	
	static int a=5;
	int b=6;
	
	
	public static void eat() {
		System.out.println("I am eating");
		a=a+1;
		//b=b+1;
	}

	
	public static void drink() {
		System.out.println("I am drinking");
		eat();
		//run();
	}
	
	public void run() {
		System.out.println("I am not static I am running");
		eat();
		drink();
		b=b+1;
		
	}
	
	
	
	
	public static void main(String[] args) {
		eat();
		drink();
		//run();
		
		StaticVSNoStatic a= new StaticVSNoStatic();
		a.run();
		
	}
	
	
	
	
	/*
	 * I can not call a non static method from  static method, because there is no object.
	 * But I can call a static method from non static method because if there is a static method there is a class
	 * 
	 * 
	 * 
	 */
	
}

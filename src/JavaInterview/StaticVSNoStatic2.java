package JavaInterview;

public class StaticVSNoStatic2 {
	
	public static void eat() {
		System.out.println("I am eating");
	}

	
	public static void drink() {
		System.out.println("I am drinking");
		StaticVSNoStatic.eat();
		//run();
	}
	
	public void run() {
		System.out.println("I am not static I am running");
		StaticVSNoStatic.eat();
		StaticVSNoStatic.drink();
		
	}
	
	
	
	
	public static void main(String[] args) {
		eat();
		drink();
		//run();
		
		StaticVSNoStatic2 a= new StaticVSNoStatic2();
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

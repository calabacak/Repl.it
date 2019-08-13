package OPPsCengiz;

public class SuperClassDemo1 {
	
	String name="Cengiz";
	int id;
	
	public SuperClassDemo1(String name) {
		this.name=name;
	}
	
	public SuperClassDemo1() {
		
	}
	
	public void method1() {
	System.out.println(name + " says I am in SupeClassDemo1");
	}
	
	public static void methodStatic(int a) {
		System.out.println("I am coming at "+ a);
		a=a+1;
		System.out.println("Please come at "+ a);
	}
	
	

}

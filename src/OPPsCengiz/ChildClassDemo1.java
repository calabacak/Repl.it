package OPPsCengiz;

public class ChildClassDemo1 extends SuperClassDemo1  {

	public ChildClassDemo1(String name) {
		super(name);
	}
	
	public ChildClassDemo1() {
	
	}
	
	public void method2() {
		System.out.println("hello I am in subclass");
		super.method1();
	}
	
	public static void  methodStatic(int a) {
		System.out.println("i am static in subclass");
	}
	
	public void method22() throws InterruptedException {
		System.out.println("hello I am in subclass ONLY");
		Thread.sleep(2000);
	}
	

}

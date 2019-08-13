package OPPsCengiz;

public class ChildClassDemo2 extends SuperClassDemo1  {

	public ChildClassDemo2(String name) {
		super(name);
	}
	
	public ChildClassDemo2() {
	
	}
	
	public void method2() {
		System.out.println("hello I am in subclass");
		super.method1();
	}
	
	public static void  methodStatic(int a) {
		System.out.println("i am static in subclass");
	}
	

}

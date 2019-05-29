package day49_inheritance_02;

public class B extends A{
	int b;
	
	public B() {
		System.out.println("No Args B");
		this.b=b;
	}
	
	public B(int b) {
	//	super();
		System.out.println("1 Args B");
		this.b=b;
	}

}

package day49_inheritance_02;

public class C extends B{
	int b;
//
//	public C() {
//		System.out.println("No Args C");
//		this.c=c;
//	}
	public C(int b) {
		//super(5);
		System.out.println("1 Args C");
		this.b=b;
	}
	
}

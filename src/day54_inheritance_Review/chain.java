package day54_inheritance_Review;

public class chain{
	public chain() {
		// this(8.5);  reason: #7
		System.out.println("A");
	}
	public chain(int a) {
		this();
		System.out.println("B");
	}
	public chain(double b) {
		this(9);
		System.out.println("C");
	}
	
}

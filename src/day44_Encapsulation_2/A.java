package day44_Encapsulation_2;

public class A {
	private int x;
	private int y;
	private String name;

	
	public A() {
	System.out.println("No Constructor");
	}
	
	public A(int x) {
		this(5,10);
	System.out.println("One Constructor");
	}
	
	public A(int x, int y) {
		this();
	System.out.println("Two Constructor");
	}
	
	
}

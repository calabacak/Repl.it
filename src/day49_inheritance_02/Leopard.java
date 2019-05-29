package day49_inheritance_02;

public class Leopard extends Animal {
	
	public Leopard() {
		super();
		System.out.println("Leopard constructor");
		setType("Leopard");
	}
	public Leopard(String type) {
		
		//setType(type);
		
		super(type);// call Animal (String type)
		
		System.out.println("Leopard one arg constructor");
		
	}
	
	
}

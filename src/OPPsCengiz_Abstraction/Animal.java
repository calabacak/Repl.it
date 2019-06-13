package OPPsCengiz_Abstraction;

public abstract class Animal {
	
	// abstract class is create by abstract key word
	// can have abstract, non-abstract and static methods
	
	// variables with all access modifiers are valid
	private String name;
	public String school;
	protected int az;
	static double salary;
	public int MIN_HOURS=40;
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public abstract void eat();
	public abstract void sleep();
	
	public void live() {
		System.out.println("Animal is living");
	}
	//Abstract classes can have constructors
	
	public Animal() {
		
	}
	

}

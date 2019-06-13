package OPPsCengiz_Abstraction;

public  class Dog extends Animal {
	// abstract class is extended, but you have to implement (override) all inherited abstract methods
	// or you can make Dog class an abstract class as well. public abstract class Dog extends Animal
		

	@Override
	public void eat() {
		System.out.println("Dog is eating dry food twice a day, its name is "+ super.getName());
		
	}

	@Override
	public void sleep() {
		System.out.println("Dog sleeps 4 hours a day");
		
	}
	
	// can I overload an abstract method? Yes because when I overload a method it is a totally different method. 
	// nothing to do with overridden sleep abstract method
	
	public void sleep(int a) {
		System.out.println("Dog sleeps "+a+" hours a day");
		
	}
	
	public void uniqueMethod() {
		System.out.println("this a method declared in Dog");
	}
	
	
	// we don't need to implement regular(concrete) but we can
	@Override
	public void live() {
		System.out.println("Animal is living");
	}
	
	// overload

	public void live(int a) {
		System.out.println("Animal lives "+a+" years");
	}
	
}

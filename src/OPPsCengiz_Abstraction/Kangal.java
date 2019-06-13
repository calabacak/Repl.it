package OPPsCengiz_Abstraction;

public class Kangal extends Dog{
	
	// I can see that i don need to implement abstract methods from Animal, although Kangal extends Dog extends Animal
	
	
	public void trustDog() {
		System.out.println("You can trust Kangal dogs");
	}

	
	// I overloaded eat method  but since I inherited from Dog I still have original eat method as well
	public void eat(int b) {
		System.out.println("Kangal is eating dry food "+b+" times a day, its name is "+ super.getName());
		
	}
	
	public void uniqueMethod() {
		System.out.println("this a method declared in Kangal");
	}
	
}

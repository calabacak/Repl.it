package day57_interfaces;

public class Dog extends Animal implements Pet, Callable{

	@Override
	public void respond() {
		System.out.println("Dog is reponding woof-woof");		
	}

	@Override
	public void keepAsPet() {
		System.out.println("Dog is keeping in the house or outside");
	}
	@Override //override animal eat method
	public void eat() {
		System.out.println("Dog eats");
	}

}
//Callable interface
//Pet interface
//Cat and Dog and both implements both Callable and Pet
//Dog extends from Animal
//Fish implements both Callable and Pet

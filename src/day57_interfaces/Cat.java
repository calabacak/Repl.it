package day57_interfaces;

public class Cat implements Pet, Callable{

	@Override // from interface Callable
	public void respond() {
		System.out.println("Cat is responding meoww meoww");
	}

	@Override // from interface Pet
	public void keepAsPet() {
		System.out.println("Cat is kept inside home");
	}

}

//Callable interface
//Pet interface
//Cat and Dog and both implements both Callable and Pet
//Dog extends from Animal
//Fish implements both Callable and Pet
package day57_interfaces;

public interface Pet {

	public static final boolean FRIENDLY = true; 	
	public abstract void keepAsPet();
	//java 8
	public default void play() {
		System.out.println("Playing hide-and-seek with a pet");
	}
	//static methods in interface are not inherited to other classes
	public static void feed(String food) {
		System.out.println("Feeding a pet with " + food);
	}

}

//Callable interface
//Pet interface
//Cat and Dog and both implements both Callable and Pet
//Dog extends from Animal
//Fish implements both Callable and Pet

package day57_interfaces;

public class Fish implements Pet{

	@Override
	public void keepAsPet() {
		System.out.println("Fish is kept in Fish Tank with water/food");
	}
}
//Callable interface
//Pet interface
//Cat and Dog and both implements both Callable and Pet
// Dog extends from Animal
//Fish implements both Callable and Pet
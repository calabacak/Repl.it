package day50_inheritance_03;

public class Dog extends Animal{
	
	@Override
	public void speak() {
		System.out.println("Dog is saying hav hav");
	}

	public void move(int steps) {
		System.out.println("Dog is moving "+ steps+" steps");
	}
	
}

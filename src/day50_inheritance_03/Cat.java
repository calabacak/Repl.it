package day50_inheritance_03;

public class Cat extends Animal{
	public void speak() {
		System.out.println("Cat is saying miyaw miyaw");
	}
	
	public void move(int steps) {
		System.out.println("Cat is moving "+ steps+" steps");
	}

}

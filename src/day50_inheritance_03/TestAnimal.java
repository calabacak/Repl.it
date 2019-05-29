package day50_inheritance_03;

public class TestAnimal {
public static void main(String[] args) {
	
	Animal an1 =new Animal();
	Cat cat1= new Cat();
	Dog dog1= new Dog();
	
	an1.speak();
	cat1.speak();
	dog1.speak();
	
	an1.move(21);
	cat1.move(12);
	dog1.move(45);
}
}

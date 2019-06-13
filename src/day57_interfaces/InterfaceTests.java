package day57_interfaces;

public class InterfaceTests {
	public static void main(String[] args) {
		//Electric el = new Electric(); cannot instantiate an interface
		Tesla t = new Tesla();
		BMWi8 i8 = new BMWi8();

		t.charge();
		i8.charge();

		t.drive();
		t.selfDrive();

		Electric el2 = new Tesla(); //this is polymorphism. we will talk more next class
		Automonous el3 = new Tesla();
		Vehicle el4= new Tesla();
		Electric el6= new BMWi8();
		//Vehicle el7= new BMWi8(); will not compile, because BMWi8 doesnot extend or implement
		
		System.out.println("========");
		
		el2.charge();
		el3.selfDrive();
		el4.drive();// we can either call from vehicle or Tesla
		el6.charge();
		System.out.println("======================");
		
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.keepAsPet();
		dog.keepAsPet();
		
		Pet dog2= new Dog();
		Animal dog3= new Dog();
		
		
		cat.play();
		dog.play();
		dog2.keepAsPet();
		
		dog.eat();
		dog3.eat();// cengiz if we are calling a method and if it exist in the objcet class it is invoked from there
		// if not then invoked from parent class
		
		
		
		
		Pet.feed("dry food");
		
		
		System.out.println(Pet.FRIENDLY);
		
		
		
		
		
		
	
	}
}

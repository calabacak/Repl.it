package day31_methods3;

public class Dog {
	public String name;
	public int age;
	public String breed;
	public String color;
	
	//let us put constructor.
	
	public Dog() { // the name of the constructor must be same as the class and no return type
		System.out.println("inside the constructor");
		
		name="default name is Timy";
		age=10;
		breed="default breed is Bulldog";
		color= "default color is brown";
	}
	
	public Dog(String name, int age, String dogBreed, String dogColor) {// now with parameters
		this.name= name;// the first time i see how this works.
		this.age= age;
		breed= dogBreed;
		color=dogColor;
		
	}
	
	
	
	
	public  void bark() {
		System.out.println(name+ " is barking");
	}
	
	public  void eat(){
		System.out.println(name+ " is eating");
	}
	
	public  void wagTail(){
		System.out.println(name+ " is wagging its tail");
	}
}

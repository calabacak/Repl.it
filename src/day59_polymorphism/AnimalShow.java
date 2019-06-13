package day59_polymorphism;

public class AnimalShow {
	public static void main(String[] args) {
		
		Animal animal1= new Animal();
		Animal animal2= new Zebra();
		Animal animal3= new Cheetah();
		Animal animal4= new Tiger();
		
		animal2.talk();
	}

}

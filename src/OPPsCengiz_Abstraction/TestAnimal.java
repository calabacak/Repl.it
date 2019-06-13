package OPPsCengiz_Abstraction;

public class TestAnimal {
	
	public static void main(String[] args) {
		
		//Animal animal1= new Animal();// abstract class cannot instantiate the type Animal
		
		Dog dog1 = new Dog();
		dog1.setName("Duman");
		dog1.eat();
		dog1.live();
		dog1.sleep();
		dog1.live(7);
		dog1.sleep(9);
		
		System.out.println("================");
		
		Kangal kangal1= new Kangal();
		
		kangal1.eat();//// I overloaded eat method  but since I inherited from Dog I still have original eat method as well
		kangal1.setName("Bulut");
		kangal1.sleep();
		kangal1.eat(5);//// I overloaded eat method  but since I inherited from Dog I still have original eat method as well
		
		System.out.println("==================");
		
		
		Dog kangal2= new Kangal();
		kangal2.eat();
		kangal2.uniqueMethod();// supe class reference variable refering to subclass object. calling the method. 
		//if I have that method in subclass it is invoked otherwise super class method is invoked.

	}

}

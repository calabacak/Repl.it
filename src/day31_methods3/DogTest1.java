package day31_methods3;

public class DogTest1 {
	public static void main(String [] args) {
		
		Dog dog1= new Dog();// in dog class we created an object called dog1
		dog1.name="Buby";
		dog1.age=5;
		dog1.breed="Buldog";
		dog1.color="Brown";
		
		System.out.println(dog1.name+" :"+dog1.age +" :"+ dog1.breed +" :"+dog1.color);
		dog1.eat();
		
		Dog dog2 = new Dog ();
		dog2.name="Tom";
		dog2.age=7;
		dog2.breed="Hunter";
		dog2.color="Black";
		
		System.out.println(dog2.name+" :"+dog2.age +" :"+ dog2.breed +" :"+dog2.color);
		dog2.bark();
		
		Dog dog3= new Dog ("Duman", 3, "Kangal", "white");// similar to Scanner scan=new Scanner(System.in); System.in is paramete
		
		System.out.println(dog3.name+" :"+dog3.age +" :"+ dog3.breed +" :"+dog3.color);
		dog3.bark();
		
		Dog dog4= new Dog("Rintintin", 11, "Chucky", "Green");
		System.out.println(dog4.name+" :"+dog4.age +" :"+ dog4.breed +" :"+dog4.color);
		dog4.bark();
		
		
	}

}

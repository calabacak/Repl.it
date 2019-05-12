package day43_Encapsulation_constructor;

public class MyPet {
	public static void main(String[] args) {
		
		Pet myPet1= new Pet("Dog", "Poochi");
		Pet myPet2= new Pet("Cat", "Barsik");
		Pet myPet3= new Pet("Cat", "Mila");
		Pet myPet4= new Pet("Fish", "Purple");
		Pet myPet5= new Pet("Goat", "Kozlik");
		Pet myPet6= new Pet("Bird", "Chika");
		
		myPet1.speak();
		
		System.out.println(myPet1.toString());
		System.out.println(myPet2.toString());
		System.out.println(myPet3.toString());
		System.out.println(myPet4.toString());
		System.out.println(myPet5.toString());
		System.out.println(myPet6.toString());
		
	}
	
	
}

package day40_customclasses_methods;

public class Test_Contact {
	public static void main(String[] args) {
		
		Contact contact1= new Contact();
		contact1.Name ="Cengiz";
		contact1.PhoneNumber= 2345678;
		contact1.email="calabacak@gmail.com";
		
		Contact orhan= new Contact();
		orhan.Name= "Orhan Sultanov";
		orhan.PhoneNumber=571-23496;
		orhan.email= "orhan@gmail.com";
		
		contact1.call();
		orhan.call();
	}

}

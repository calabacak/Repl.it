package day43_Encapsulation_constructor;

public class CreatePeopleHere {
	public static void main(String[] args) {
	
		Person john= new Person("01/02/2000");
		
		System.out.println(john.getBirthday());
		
		john.setFirstName("John");
		john.setLastName("Doe");
// 		john.setBirthday("01/01/2000");
		john.setLastName("cengiz");
		
		System.out.println(john.toString());
	}

}

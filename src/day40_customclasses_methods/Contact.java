package day40_customclasses_methods;

public class Contact {
	String Name;
	int PhoneNumber;
	String email;
	
	
	public void call() {
		System.out.println(Name + " is calling");
	}
	public void sendMessage() {
		System.out.println(Name + " is messaging");
	}
	public void sendEmail() {
		System.out.println(Name + " is emailing");
	}

}

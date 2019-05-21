package day43_Encapsulation_constructor;

public class Person {
	private String firstName;
	private String lastName;
	private String birthday;
	
	
	public Person (String birthday) {
		this.birthday=birthday;
		//System.out.println("contructing");
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
//	public void setBirthday(String birthday) {
//		this.birthday = birthday;
//	}
//	
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + "]";
	}
	
	

}

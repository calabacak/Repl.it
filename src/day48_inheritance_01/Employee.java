package day48_inheritance_01;

public class Employee extends Person {
	String jobTitle;
	
	
	public void work() {
		System.out.println(name+ " is working as "+ jobTitle);
	}

}

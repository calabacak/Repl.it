package day40_customclasses_methods;

public class Employee {
	public String name;
	public String jobTitle;
	public double salary;
	
	
	public void work() {
		
		System.out.println(name +" is working");
		

	}
	public void attendMeeting() {
		System.out.println(name + " is attending the meeting");
	
	}
	public void inntroduce() {
		System.out.println("His name is "+ name + " His job title is "+ jobTitle +" His salary is "+ salary);
		
	}

}

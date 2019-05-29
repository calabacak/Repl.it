package day48_inheritance_01;

public class Company {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.name="Marufjan";
		emp1.jobTitle="teacher";
		emp1.gender='M';
		emp1.age=22;
		
		emp2.name="Kiki";
		emp2.jobTitle="HR";
		emp2.gender='F';
		emp2.age=24;
		
		emp1.work();
		emp2.work();
		
	}

}

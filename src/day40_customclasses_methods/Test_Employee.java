package day40_customclasses_methods;

public class Test_Employee {
	public static void main(String[] args) {
		
		Employee emp1= new Employee();
		emp1.name="Cengiz";
		emp1.jobTitle="SDET";
		emp1.salary=145000;
		
		emp1.attendMeeting();
		emp1.work();
		emp1.inntroduce();
		
	}

}

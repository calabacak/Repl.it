package day55_abstraction;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee emp1= new Employee("Cengiz", 4159);
		Employee emp2 = new Employee("GulNihal", 4159);
		Employee emp3= new Employee("Cengiz", 4159);
		
		System.out.println(emp1.toString());
		System.out.println(emp3.toString());
		System.out.println(emp2.toString());
		System.out.println(emp1==emp2);
		System.out.println(emp1==emp3);
		System.out.println(emp1.getName()==emp3.getName());
		System.out.println(emp1.getId()==emp3.getId());
		System.out.println(emp1.equals(emp3));
		System.out.println(emp1.equals(emp2));
		
		
		
		
	}

}

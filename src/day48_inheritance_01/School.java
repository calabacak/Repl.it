package day48_inheritance_01;

public class School {
	public static void main(String[] args) {
		
		Person person = new Person();
		Student student = new Student();
		Student student2 = new Student();
		person.name= "Obama";
		person.age=57;
		person.gender='M';
		
		student.name="Roman";
		student.age=30;
		student.gender='M';
		
		student2.name="Orhan";
		student2.age=40;
		student2.gender='M';
		student2.studentID=434;
		student2.clazz= "Agile Scrum";
		
		person.eat("steak");
		student.eat("kebab");
		
		person.walk();
		student.walk();
		
		person.sleep(8);
		student.sleep(6);
		
		student2.code("Java");
		student2.attendClass();
		
		
		
	}

}

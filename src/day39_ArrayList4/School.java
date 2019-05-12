package day39_ArrayList4;

public class School {
	public static void main(String[] args) {
		
		Student student1= new Student();
		student1.name="cengiz";
		student1.age=34;
		student1.subject="Java";
		System.out.println("object 1");
		System.out.println("Name: "+student1.name);
		System.out.println("Age: "+student1.age);
		System.out.println("Subject: "+student1.subject);
		
		Student student2= new Student();
		student2.name="Cleetus";
		student2.age=28;
		student2.subject="Python";
		
		System.out.println("object 2");
		System.out.println(student2.name);
		System.out.println(student2.age);
		System.out.println(student2.subject);
		
	}

}

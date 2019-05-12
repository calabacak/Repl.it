package day42_customclasses_encapsulation;
import java.util.*;

public class Test_Student {
	public static void main(String[] args) {
		
		Student student1= new Student();
		Student student2= new Student();
		Student student3= new Student();
		Student student4= new Student();
		Student [] studentArr= new Student [3];
		ArrayList<Student> studentArrList= new ArrayList<>();
		
		

		
		
		
		student1.setfirstNameAndLastName("cengiz alabacak");
		student1.setId(442);
		student1.setLanguage("English");
		//System.out.println(student1.getStudentInfo());
		
		student2.setAllStudentData("Gul Nihal Alabacak", 396, "German");
		//System.out.println(student2.getStudentInfo());
		student3.setAllStudentData("ceyda alabacak", 1234, "Turkish");
		//System.out.println(student3.getStudentInfo());
		
		String [] les= {"abc","def","ghi"};
		student4.setLessons(les);
		student4.getStudentInfo();
		System.out.println(Arrays.toString(student4.getLessons()));
		
		
		
		studentArr[0]=  student1;
		studentArr[1]=  student2;
		studentArr[2]=  student3;
		

		
		
		
		
//		for(int i=0; i<studentArr.length;i++) {
//			System.out.println(studentArr[i].getStudentInfo());
//		}
//		
		studentArrList.add(student1);
		studentArrList.add(student2);
		studentArrList.add(student3);
		System.out.println(studentArrList.get(0).getStudentInfo());
		
	}

}

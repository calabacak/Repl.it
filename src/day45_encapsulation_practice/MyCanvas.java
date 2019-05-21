package day45_encapsulation_practice;

import java.util.*;

public class MyCanvas {
	public static void main(String[] args) {

		MyCourse course1 = new MyCourse();
		ArrayList<String> javateachers = new ArrayList<>();
		ArrayList<String> javastudents = new ArrayList<>();

		course1.setName("Java Programming");
		course1.addTeacherName("Murodil");
		course1.addTeacherName("Muhtar");
		course1.addTeacherName("Vasyl");
		course1.addTeacherName("Marofjan");
		course1.addStudentName("Osman");
		course1.addStudentName("Cengiz");
		course1.addStudentName("Metin");
		course1.addStudentName("Salih");
		javastudents.add("Ali");
		javastudents.add("Veli");
		
		course1.setStudents(javastudents);

		System.out.println(course1.toString());
		
		course1.addStudentName("Ethem");
		System.out.println(course1.toString());

		if (course1.getStudents().contains("Ethem")) {
			System.out.println("Ethem is added to student list successfully");
		} else {
			System.out.println("Ethem is added to student list NOT successfully");
		}
		
		String z=(course1.getStudents().contains("Ethem"))? "E successfully":"E NOT successfully";
		
		System.out.println(z);
		
		
		
		System.out.println(course1.toString());

		course1.getTeachers().remove("Marofjan");
		if (!course1.getTeachers().contains("Marofjan")) {
			System.out.println("Marofjan is removed from the list successfully");
		} else {
			System.out.println("Marofjan is NOT removed from the list");
		}

	}

}

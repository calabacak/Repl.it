package day45_encapsulation_practice;
import java.util.*;

public class MyCourse {
	
	private String name;
	private ArrayList<String> students= new ArrayList<>();
	private ArrayList<String> teachers= new ArrayList<>();
	
	
	public void addStudentName(String studentName) {
		students.add(studentName);
	}
	
	public void removeStudentName(String studentName) {
		students.remove(studentName);
	}
	
	public void addTeacherName(String  teacherName) {
		teachers.add(teacherName);
	}
	public void removeTeacherName(String teacherName) {
		teachers.remove(teacherName);
	}

	



	@Override
	public String toString() {
		return "MyCourse [name=" + name + ", students=" + students + ", teachers=" + teachers + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<String> students) {
		this.students = students;
	}

	public ArrayList<String> getTeachers() {
		return teachers;
	}

	public void setTeachers(ArrayList<String> teachers) {
		this.teachers = teachers;
	}
	
	
	
	
	
	
	

}

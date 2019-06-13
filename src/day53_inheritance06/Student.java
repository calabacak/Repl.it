package day53_inheritance06;
/*
 * Write a superclass Student that contains:
a constructor that accepts a String corresponding to the name of the school the student attends
a toString method that returns 'student at X' where X is the name of the school the student attends.

Then write a subclass HighSchoolStudent containing:
a constructor accepting a String which is used as a parameter to the superclass constructor
a toString method that returns 'high school student at X'. This method must use the toString method of its superclass.
 */

public class Student {
	
	private String school;
	
	
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public  Student(String school) {
		this.school=school;
	}
	
	public String toString() {
		return "student at "+school;
	}

}

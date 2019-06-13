package day53_inheritance06;

public class HighSchoolStudent extends Student{
	/*
	 * Then write a subclass HighSchoolStudent containing:
a constructor accepting a String which is used as a parameter to the superclass constructor
a toString method that returns 'high school student at X'. This method must use the toString method of its superclass.
 */
	 

	public HighSchoolStudent(String school) {
		super(school);
		 
	 }
	 
	public String toString() {
		return "high school "+super.toString();
	}
}

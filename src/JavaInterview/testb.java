package JavaInterview;

public class testb {
	/*
	 * Create a UAGStudent class with the following:

1. Class Variables
name (String)
grade (int)
principalName (String, static, default value: "Ms. McKoy")
studentID (String)
nextID (int, static, default value: 100)

Note: studentID is composed of the student's first initial in uppercase followed by the nextID

2. Constructors
Main constructor takes in name and grade only.  
When the main constructor is called, it generates a student's ID by combining the student's first initial in uppercase combined with the next ID.  The nextID should then be increased by 1.

Example: name is "Alfonso Lewis", static variable nextID is 105 ==> studentID is A105

3. Class Methods

Write a static method called "newPrincipal" that returns nothing and takes in one String parameters that represents the new principal's name.  Set the static variable principalName to the new principal's name.

Write a static method called "resetID" that takes no arguments and returns nothing.  This method resets the nextID to 100.

Write a method called "toString" that has no parameters and returns a String.  This method should return the student's name and the student's ID, separated by a space.
	 */
	
	
	String name;
	int grade;
	static String principalName="Ms. McKoy";
	String studentID;
	static int nextID=100;
	
	
	public testb(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
		//this.studentID
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

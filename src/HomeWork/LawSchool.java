package HomeWork;

public class LawSchool extends EducationalInstitution{
	
/*
 * a (default) constructor that invokes the superclass 
 * constructor with the value 3 (law school is typically a three year program).
 * 
 */

	public LawSchool(){
		super(3);	
	}
	
	/*
	 * a (overridden) method graduationRequirements that returns the string 
	 * "3 years of study and passing the bar". You MUST invoke the graduationRequirements method 
	 * of the superclass in this method (to obtain the first portion of the resulting string).
	 */
	@Override
	public String graduationRequirements() {
		return getYears()+" years of study and passing the bar";
	}
	
}

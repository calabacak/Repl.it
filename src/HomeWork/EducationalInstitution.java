package HomeWork;

public class EducationalInstitution {
	
	/*
	 * an int instance variable, duration, 
	 * indicating the standard number of years spent at the institution
	 */
private int years;



/*
 * A constructor that accepts an int 
 * which is used to initialize the duration instance variable
 */

public int getYears() {
	return years;
}

public void setYears(int years) {
	this.years = years;
}

public EducationalInstitution(int years) {
	this.years=years;
}
	/*
	 * a method graduationRequirements that returns a String. 
	 * The (default) behavior of graduationRequirements is to 
	 * return a String stating "d years of study", 
	 * where d is the value of the duration instance variable
	 */

public String graduationRequirements() {
	return years+" years of study";
}
}

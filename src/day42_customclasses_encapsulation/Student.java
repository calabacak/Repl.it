package day42_customclasses_encapsulation;

public class Student {
	
	private String firstNameAndLastName;
	private int id;
	private String language;
	private String [] lessons;
	
	
	
	
	
	public String[] getLessons() {
		return lessons;
	}

	public void setLessons(String[] lessons) {
		this.lessons = lessons;
	}
	

	public void setfirstNameAndLastName(String firstNameAndLastName) {
		this.firstNameAndLastName=firstNameAndLastName;
	}
	
	public String getName() {
		return firstNameAndLastName;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}

	public void setLanguage(String language) {
		this.language=language;
	}
	
	public String getStudentInfo() {
		
		String info= "Name & Lastname: "+ firstNameAndLastName + " ID: "+ id + " Language: "+ language+
				" lessons: "+ lessons;
		return info;
	}
	
	public void setAllStudentData(String firstNameAndLastName, int id, String language) {
		this.firstNameAndLastName=firstNameAndLastName;
		this.id=id;
		this.language= language;
		
		
	}
	
	
	
}

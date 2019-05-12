package day41_customClasseses02;

public class Employee {
	String firstName;
	String lastName;
	int employee_id;
	int age;
	float hourlyRate;
	char gender;
	boolean isInsured;
	String title;
	String email;
	String [] titles= {"Developer", "Scrum Master", "SDET", "PO", "QA Analist", "BA", "HR"};

	public void printInfo() {
		System.out.println("First name: " + firstName + ", Last name: " + lastName + ", Employee id: " + employee_id
				+ ", Age: " + age + ", Hourly rate: " + hourlyRate + "$, Gender: " + gender + ", Insured? " + isInsured
				+ ", Title: " + title+", Email: "+email);
	}

	public String createEmail() {
		String newEmail= firstName.toLowerCase()+"_"+lastName.toLowerCase()+"@gmail.com";
		email=newEmail;
		return newEmail;
	}
	
	public void setEmail(String e) {
		if(e.contains("@")) {
			email=e;
		}else {
			System.out.println("invalid email");
		}
	}
	// this method will validate job title before setting
	public void setJobTittle(String str) {
		boolean isValid = false;
		for(String t:titles) {
			if(t.contentEquals(str)) {
				title=str;
				isValid= true;
			}
		}
		if(isValid) {
			System.out.println("Title was set successfully");
		}else {
			System.out.println("invalid job title");
		}
	}
	

	public void printEmail() {
		
		System.out.println("Email of "+firstName+ " "+lastName+ " :"+ email);
	}
	
	
}

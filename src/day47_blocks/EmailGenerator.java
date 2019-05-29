package day47_blocks;

public class EmailGenerator {
	
	static String companyName;
	
	String name;
	
	public EmailGenerator(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return name + "@"+companyName+".com";
	}

}

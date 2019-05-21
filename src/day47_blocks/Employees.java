package day47_blocks;

public class Employees {
	public static void main(String[] args) {
		EmailGenerator.companyName="sony";
		EmailGenerator e1 = new EmailGenerator("Cengiz");
		
		System.out.println(e1.getEmail());
	}

}

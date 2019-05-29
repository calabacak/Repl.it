package day51_inheritance_04;

public class ScrumTeamMember {
	
	private String name;
	protected String position="ScrumTeamMember";//inherited;
	private double salary;
	protected String LinkedInId;//inherited;
	
	static {
		System.out.println("ScrumTeamMember STATIC block");
		
	}
	
	{
		System.out.println("ScrumTeamMember INIT block");
	}
	
	public ScrumTeamMember() {
		System.out.println("ScrumTeamMember CONSTRUCTOR block");
	}
	
	
	public void work() {
		System.out.println(position+" is working busy");
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}

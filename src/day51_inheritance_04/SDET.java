package day51_inheritance_04;

public class SDET extends ScrumTeamMember{
	
	protected String position="Java SDET";
	
	@Override
	public void work() {
	System.out.println(position+ " is testing busy");
	}
	
	static {
		System.out.println("SDET STATIC block");
		
	}
	
	{
		System.out.println("SDET INIT block");
	}
	
	public SDET() {
		System.out.println("SDET CONSTRUCTOR block");
	}
	
}

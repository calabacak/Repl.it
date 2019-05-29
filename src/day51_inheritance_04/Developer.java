package day51_inheritance_04;

public class Developer extends ScrumTeamMember{
	
	protected String position="Java Developer";
	
	@Override
	public void work() {
		System.out.println(position+ " is developing application");
	}

}

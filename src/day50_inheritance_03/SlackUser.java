package day50_inheritance_03;

public class SlackUser {
	private String name;
	
	public void sendAMessage(String message) {
		
		System.out.println(name+" is sending a message <"+message+" <");
		
	}
	
	public SlackUser(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}

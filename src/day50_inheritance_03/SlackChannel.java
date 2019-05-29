package day50_inheritance_03;

public class SlackChannel {
	public static void main(String[] args) {
		
		SlackUser su = new SlackUser("Nadir");
		SlackUser au = new SlackUser("Florian");
		
		su.sendAMessage("this Thursday we will summarize Jira");
		au.sendAMessage("thank you");
		
	}

}

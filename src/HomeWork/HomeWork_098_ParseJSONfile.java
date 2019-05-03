package HomeWork;

import java.util.Scanner;

public class HomeWork_098_ParseJSONfile {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//String json = scan.nextLine();
		
		String json = "{\"id\": 1944, \"firstName\": \"Cecil\", \"lastName\": \"Nacey\", \"role\": \"student-team-leader\"}";
		
		json=json.replace(" ", "").trim();
		
		//json.trim();
		
		String fn = json.substring(json.indexOf("firstName")+12, json.indexOf("lastName")-3);
		
		String ln = json.substring(json.indexOf("lastName")+11, json.indexOf("role")-3);
		
		System.out.println("First name: "+fn);
		System.out.println("Last name: "+ln);
		
		//System.out.println(json);
	
	}

}

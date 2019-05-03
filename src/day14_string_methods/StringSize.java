package day14_string_methods;

public class StringSize {
	public static void main(String[] args) {
		String userName = "calabacak";
		
		int length = userName.length();
		
		if (length<6) {
			System.out.println("invalid user name must be 8 chars");
		}
		if (length>=6) {
			System.out.println("valid user name good");
		}
//		
////		if(str1.contentEquals("Good Morning")) {System.out.println("Match");}
////		else {System.out.println("Not Match");}
////		if(str1.equalsIgnoreCase("good moning")) {System.out.println("match- ignore case");}
////		if(str1.equals("good moning")) {System.out.println("no match- without ignore case");}
//		
//		
//		if(str1.toLowerCase().contentEquals("good morning")) {System.out.println("match");}
//		
//		System.out.println(str1.toLowerCase());
//		int length = str1.length();
//		System.out.println(length);
		
	}

}

package day35_Review;

public class Practise4 {
	
	public static char findUniqueChar(String alphabet, String encrypted, char ch) {
		
		return alphabet.charAt(encrypted.indexOf(ch));
		
		
	}


}

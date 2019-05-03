package day35_Review;

public class Stringencripted {

	public static void main(String[] args) {

		// without methods;

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";
		String sentence = "I will go";
		String word = "monday";
		char ch = 'y';

		//System.out.println(decryptChar(alphabet, encrypted, ch));
		//System.out.println(decryptString(alphabet, encrypted, word));
		System.out.println(decryptSentence(alphabet, encrypted, sentence));
	}
	public static char decryptChar(String alphabet, String encrypted, char ch) {
		int position = alphabet.indexOf(ch);
		char result = encrypted.charAt(position);
		return result;
	}

	public static String decryptString(String alphabet, String encrypted, String word) {
		String str = "";
		for (int i = 0; i < word.length(); i++) {
			str += decryptChar(alphabet, encrypted, word.charAt(i));
		}
		return str;
	}
	
	public static String decryptSentence(String alphabet, String encrypted, String sentence) {
		
		String [] arrword = sentence.split(" ");
		
		String value= "";
		
		for(String word: arrword) {
			value+=decryptString( alphabet,  encrypted,  word)+" ";
		}
		return value.trim();
		
	}
	
	
	
	
	
	

}
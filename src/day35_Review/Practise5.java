package day35_Review;

public class Practise5 {

	public static String findUniqueString(String alphabet, String encrypted, String word) {

		String str = "";
		for (int i = 0; i < word.length(); i++) {
			str += Practise4.findUniqueChar(alphabet, encrypted, word.charAt(i));
		}
		return str;
	}
	
	
	public static String findUniqueSentence(String alphabet, String encrypted, String sentence) {
		String [] strarr= sentence.toLowerCase().split(" ");
		String str = "";
		
		for(String s: strarr) {
			str+=Practise5.findUniqueString(alphabet, encrypted, s)+" ";
		}
		return str;
	}

}

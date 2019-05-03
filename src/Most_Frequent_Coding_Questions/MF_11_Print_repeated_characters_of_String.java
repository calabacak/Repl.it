package Most_Frequent_Coding_Questions;

public class MF_11_Print_repeated_characters_of_String {

	public static void main(String[] args) {

		String strtest = "albabacakk";

		System.out.println(printRepeatedCharactersOnly(strtest));
		
	
	}

	public static String printRepeatedCharactersOnly(String str) {
		int count = 0;
		String repeated = "";

		for (int i = 0; i < str.length(); i++) {
			count = 0;// dont forget to reset the count value
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				repeated += str.charAt(i);
			}
		}

		return repeated;
	}
//	public static String printRepeatedCharactersOnlyOnce(String str) {
//		can not think of how?
//		
//	}
}

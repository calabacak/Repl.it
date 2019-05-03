package Most_Frequent_Coding_Questions;

public class MF_11_Print_unique_characters_of_String2 {

	public static void main(String[] args) {

		String strtest = "alabacak";

		printUniqueCharactersOnly(strtest);
	}

	public static void printUniqueCharactersOnly(String str) {
		int count = 0;
		// String repeated = "";

		for (int i = 0; i < str.length(); i++) {
			count = 0;// dont forget to reset the count value
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				// repeated += str.charAt(i);
				System.out.println(str.charAt(i));
			//break; give me the first one
			}
		}

		// return repeated;
	}
//	public static String printRepeatedCharactersOnlyOnce(String str) {
//		can not think of how?
//		
//	}
}

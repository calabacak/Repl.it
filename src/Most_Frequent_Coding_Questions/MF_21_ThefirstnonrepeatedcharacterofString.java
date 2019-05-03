package Most_Frequent_Coding_Questions;

public class MF_21_ThefirstnonrepeatedcharacterofString {
	public static void main(String[] args) {
		
		System.out.println(findTheFirstNonRepeatedChar("alabacak"));

	}

	public static char findTheFirstNonRepeatedChar(String str) {
		int count = 0;
		char result = ' ';
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				result = str.charAt(i);
				break;
			}
		}
		return result;
	}

}

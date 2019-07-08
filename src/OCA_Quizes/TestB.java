package OCA_Quizes;

public class TestB {

	public static void main(String[] args) {
		String[] arr = { "hey", "yolo", "hi", "this is long" };
		System.out.println(minVowels(arr));
		// should print "hi"
	}

	public static String minVowels(String[] words) {

		int minvowel = 100;
		String result = words[0];
		for (int i = 0; i < words.length; i++) {
			if (countVowels(words[i]) <= minvowel) {
				minvowel = countVowels(words[i]);
				if (words[i].length() < result.length()) {

					result = words[i];
				}
			}
		}
		return result;
	}
	public static int countVowels(String s) {
		int numofvowel = 0;
		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				numofvowel++;
			}
		}
		return numofvowel;
	}
	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}
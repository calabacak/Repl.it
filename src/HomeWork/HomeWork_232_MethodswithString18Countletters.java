package HomeWork;

public class HomeWork_232_MethodswithString18Countletters {
	public static void main(String[] args) {
		// input: countLetters("aaabbcccc");
		// output: "3a2b4c"

		System.out.println(countLetters("alabacak"));
		System.out.println(countLettersv2("alabacak"));
		System.out.println(countLettersv3("alabacak"));

	}

	public static String countLetters(String str) {
		String result = "";
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (ch == str.charAt(i)) {
					count++;
				}
			}
			if (count > 0) {
				result += count + "" + ch;
			}
		}
		return result;
	}

	public static String countLettersv2(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (ch == str.charAt(i)) {
					count++;
				}
			}
			if (count > 0) {
				result += count + "" + str.charAt(i);
			}
		}
		return result;
	}

	public static String countLettersv3(String str) {
		String result = "";
		for (int j = 0; j < str.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(j) == str.charAt(i)) {
					count++;
					if (str.charAt(j) == '#') {
						count = 0;
					}
				}
			}
			if (count > 0) {
				result += count + "" + str.charAt(j);
				str = str.replaceAll("" + str.charAt(j), "#");
			}
		}
		return result;
	}
}

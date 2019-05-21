package Most_Frequent_Coding_Questions;

import java.util.Arrays;

public class MF_18_String_Anagram3 {
	public static void main(String[] args) {

		System.out.println(isAnagramv3("qadeanada", "adeanaqad"));

	}

	public static boolean isAnagram(String word1, String word2) {
		String sword1 = word1.replace(" ", "").toLowerCase().trim();
		String sword2 = word2.replace(" ", "").toLowerCase().trim();
		int count1 = 0;
		int count2 = 0;
		if (sword1.length() != sword2.length()) {
			return false;
		} else {
			for (int i = 0; i < sword1.length(); i++) {
				if (!sword1.contains("" + sword2.charAt(i))) {
					return false;
				} else {

					for (int j = 0; j < sword1.length(); j++) {
						if (sword1.charAt(j) == (sword2.charAt(i))) {
							count1++;
						}
						if (sword2.charAt(j) == (sword2.charAt(i))) {
							count2++;
						}

					}
					if (count1 != count2) {
						return false;
					}

				}
			}
		}

		return true;
	}

	public static boolean isAnagramv2(String word1, String word2) {
		String sword1 = word1.replace(" ", "").toLowerCase().trim();
		String sword2 = word2.replace(" ", "").toLowerCase().trim();
		char[] s1 = sword1.toCharArray();
		char[] s2 = sword2.toCharArray();

		Arrays.sort(s1);
		Arrays.sort(s2);

		if (Arrays.equals(s1, s2)) {
			return true;
		}
		return false;
	}

	public static boolean isAnagramv3(String word1, String word2) {
		String sword1 = word1.replace(" ", "").toLowerCase().trim();
		String sword2 = word2.replace(" ", "").toLowerCase().trim();

		int ascii1 = 0;
		int ascii2 = 0;
		for (int i = 0; i < sword1.length(); i++) {
			ascii1 += sword1.charAt(i);
		}
		for (int i = 0; i < sword2.length(); i++) {
			ascii2 += sword2.charAt(i);
		}

		if (ascii1 == ascii2) {
			return true;
		}
		return false;
	}
}

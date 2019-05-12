package Most_Frequent_Coding_Questions;

public class MF_18_String_Anagram {
	public static void main(String[] args) {

		String str1 = "adandaa";
		String str2 = "aadnada";
		int count1 = 0;
		int count2 = 0;
		if (str1.length() != str2.length()) {
			System.out.println(str1 + " and " + str2 + " are not anagram");

		} else {
			for (int i = 0; i < str1.length(); i++) {
				if (!str1.contains("" + str2.charAt(i))) {
					System.out.println(str1 + " and " + str2 + " are not anagram");
				} else {
					count1 = 0;
					count2 = 0;
					for (int j = 0; j < str1.length(); j++) {
						if (str1.charAt(j) == (str2.charAt(i))) {
							count1++;
						}
						if (str2.charAt(j) == (str2.charAt(i))) {//take a look at this
							count2++;
						}
					}
					if (count1 != count2) {
						System.out.println(str1 + " and " + str2 + " are not anagram");
						return;
					}
				}
			}
			System.out.println(str1 + " and " + str2 + " are anagram");
		}

	}
}

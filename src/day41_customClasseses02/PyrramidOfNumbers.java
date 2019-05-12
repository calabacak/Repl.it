package day41_customClasseses02;

public class PyrramidOfNumbers {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

		String str = "Better Butter";

		String str1 = str.toLowerCase().replace(" ", "").trim();

		System.out.println(str1);

		for (int i = 0; i < str1.length(); i++) {
			int count = 0;
			for (int j = 0; j < str1.length(); j++) {
				if (!str1.substring(0, i).contains("" + str1.charAt(i))) {
					if (str1.charAt(i) == str1.charAt(j)) {
						count++;
					}
				}

			}
			if (count != 0) {
				System.out.println("The count of " + str1.charAt(i) + " is " + count);
			}
		}
		
		
		String str3="cengiz";
		System.out.println(str3.subSequence(0, 2));
		

	}

}

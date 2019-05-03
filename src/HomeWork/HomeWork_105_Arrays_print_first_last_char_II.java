 package HomeWork;

import java.util.Scanner;

public class HomeWork_105_Arrays_print_first_last_char_II {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

		String str = "";
		for (int i = 0; i < words.length; i++) {

			if (i == words.length - 1) {
				str += words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1);
			} else
				str += words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1) + ", ";

		}
		System.out.println("[" + str + "]");

	}

}

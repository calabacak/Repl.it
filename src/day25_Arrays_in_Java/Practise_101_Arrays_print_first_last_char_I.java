package day25_Arrays_in_Java;

import java.util.Scanner;

public class Practise_101_Arrays_print_first_last_char_I {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("how many words?\n");

		int length = scan.nextInt();

		String[] words = new String[length];

		System.out.println("enter words");

		for (int i = 0; i < length; i++) {
			words[i] = scan.next();
		}
		for (String word : words) {
			System.out.println(word.charAt(0) + "" + word.charAt(word.length() - 1));
		}
	}

}

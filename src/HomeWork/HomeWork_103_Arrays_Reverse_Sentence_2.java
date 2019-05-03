package HomeWork;

import java.util.Scanner;

public class HomeWork_103_Arrays_Reverse_Sentence_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";

		String[] words = sentence.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {

			if (i != 0) {
				reversed = reversed + words[i] + " ";
			} else
				reversed = reversed + words[i];
		}
		System.out.println(reversed);

	}
}
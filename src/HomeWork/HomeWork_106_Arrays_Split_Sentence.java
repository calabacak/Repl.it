package HomeWork;

import java.util.Scanner;

public class HomeWork_106_Arrays_Split_Sentence {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String[] words = sentence.split(" ");

		for (String word : words) {

			System.out.println(word);
		}
	}
}
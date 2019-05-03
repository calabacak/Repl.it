package SpecialTopics;

public class ST_05_Alphabetical_Manipulation {

	public static void main(String[] args) {

		getLettersBetween('c', 'k');

	}

	public static void getLettersBetween(char start, char end) {

		String inBetween = "";

		for (char i = start; i <= end; i++) {// be careful when declaring char i = start, not confuse with int i!

			inBetween = inBetween + i;
		}

		System.out.println(inBetween);

	}
}
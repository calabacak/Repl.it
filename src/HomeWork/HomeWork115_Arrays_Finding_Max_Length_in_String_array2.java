package HomeWork;

import java.util.Scanner;

public class HomeWork115_Arrays_Finding_Max_Length_in_String_array2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for (int i = 0; i < 5; i++) {

			words[i] = input.nextLine();
		}
		
		
		String temp = "";
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[j].length() > words[i].length()) {
					temp = words[j];
					words[j] = words[i];
					words[i] = temp;
				}
			}
		}
		System.out.println(words[0]);

	}

}
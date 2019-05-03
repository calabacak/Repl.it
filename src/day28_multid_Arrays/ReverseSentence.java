package day28_multid_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String sentence = scan.nextLine();

		String[] str = sentence.split(" ");
		System.out.println(Arrays.toString(str)+ "has "+str.length+ " words" );

		for (int i = str.length - 1; i >= 0; i--) {

			System.out.println(str[i]);
		}
	}

}

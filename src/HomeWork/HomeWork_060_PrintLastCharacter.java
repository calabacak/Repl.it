package HomeWork;

import java.util.Scanner;

public class HomeWork_060_PrintLastCharacter {
	public static void main(String[] args) {
		
		String x;
		Scanner word = new Scanner(System.in);
		System.out.println("Enter word");
		x= word.next();
		System.out.println(x.charAt(x.length()-1));
		
	}

}

package HomeWork;

import java.util.Scanner;

public class CountHi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// String str = scan.nextLine();
		int count = 0;
		String str = "hi everyone hi Gul hi ceyda hi";

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.substring(i, i + 2).equals("hi")) {
				count += 1;
			}
		}
		System.out.println(count);
		String str2 = "cengiz";
		System.out.println(str2.indexOf('t'));

	}

}

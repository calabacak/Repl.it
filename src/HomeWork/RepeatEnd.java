package HomeWork;

import java.util.Scanner;

public class RepeatEnd {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		

		String s = str.substring(str.length()-n);
		System.out.println(s+s+s);
		
	}

}

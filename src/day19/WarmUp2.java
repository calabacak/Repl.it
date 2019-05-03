package day19;

import java.util.Scanner;

public class WarmUp2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the word");
		
		String word = scan.nextLine();
		
//		int i = 0;
//		
//		while(i <= word.length()-1) {
//			
//			char c = word.charAt(i);
//			
//			System.out.println(c);
//			
//			i++;
//			
//		}
		
		int i = word.length()-1;
		
		while(i >=0) {
//			
			char c = word.charAt(i);
			
			System.out.print(c+" - ");
			
			i--;
//			
//		}
	}

}
}
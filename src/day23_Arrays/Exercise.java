package day23_Arrays;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		
			
			if(word.length()>=4) {
				if(word.substring(0, 4).contentEquals("java") || word.substring(1, 5).contentEquals("java")){
					System.out.println(true);
				}else System.out.println(false);
			}else System.out.println(false);
		}
		
		
	
}

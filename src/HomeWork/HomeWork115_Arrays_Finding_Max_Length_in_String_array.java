package HomeWork;

import java.util.Scanner;

public class HomeWork115_Arrays_Finding_Max_Length_in_String_array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		
		int a= words[0].length();
		int b= words[1].length();
		int c= words[2].length();
		int d= words[3].length();
		int e= words[4].length();
		
		if(a>b && a>c && a>d && a>e ) {
			System.out.println(words[0]);
		}else if (b>a && b>c && b>d && b>e ) {
			System.out.println(words[1]);
		}else if (c>a && c>b && c>d && c>e ) {
			System.out.println(words[2]);
		}else if (d>a && d>b && d>c && d>e ) {
			System.out.println(words[3]);
		}else if (e>a && e>b && e>c && e>d ) {
			System.out.println(words[4]);
		}
		
		
		
		
	}

}
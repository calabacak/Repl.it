package day18_whiledowhileloops;

import java.util.Scanner;

public class banana_dresser_grammar_potato_revive_uneven_assess {
	public static void main(String[] args) {
		String str2="";
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a word");

		String str = scan.next();

		while(!str.contentEquals("quit")){

			String str1 = str.substring(1, str.length())+str.charAt(0);
			System.out.println("str1 = "+str1);
			
			for(int i=str.length()-1;i>=0;i--)	{
				str2 = str2+ str1.charAt(i);
				
			}
			
			System.out.println("str2 = "+str2);
			if(str.contentEquals(str2)) {

				System.out.println("bingo");
			}else {
				System.out.println("enter a word");
				str = scan.next();
			}


		}
	}

}

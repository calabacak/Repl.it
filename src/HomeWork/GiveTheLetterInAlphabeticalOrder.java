package HomeWork;

import java.util.Scanner;

public class GiveTheLetterInAlphabeticalOrder {
	public static void main(String[] args) {
		
		//char first='d';
		//char last='j';
		String strAll="";
		

		
		   Scanner scan = new Scanner(System.in);
		    char start = scan.next().charAt(0);
		    char end = scan.next().charAt(0);
		    
			boolean b1 = Character.isLowerCase(start);
			boolean b2 = Character.isLowerCase(end);
			boolean b3 = Character.isUpperCase(start);
			boolean b4 = Character.isUpperCase(end);
		
			if(b1&&b2) {
		for(char i = 'a'; i<='z'; i++ ) {
			strAll+=i;
		}//System.out.println(strAll);
		System.out.println(strAll.substring(strAll.indexOf(start), strAll.indexOf(end)+1));
			}else if(b3&&b4){
		for(char i = 'A'; i<='Z'; i++ ) {
			strAll+=i;
		}//System.out.println(strAll);
		System.out.println(strAll.substring(strAll.indexOf(start), strAll.indexOf(end)+1));
	}

	}
}

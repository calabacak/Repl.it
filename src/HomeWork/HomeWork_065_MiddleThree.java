package HomeWork;

import java.util.Scanner;

public class HomeWork_065_MiddleThree {

	  public static void main(String[] args) {
		  
		 char char1,char2,char3;
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		if(word.length()%2==1 && word.length()>=5) {
			
			char1=	word.charAt(		(word.length()	)/2		-1	);
			char2=	word.charAt(		(word.length()	)/2			);
			char3=	word.charAt(		(word.length()	)/2		+1	);

			System.out.println(char1 + "" + char2 + "" + char3);
			
		}else
			System.out.println("invalid");
		    
		    
		    
		  }
		}

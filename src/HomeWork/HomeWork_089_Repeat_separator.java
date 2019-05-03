package HomeWork;

import java.util.Scanner;

public class HomeWork_089_Repeat_separator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    String str ="";
	    
	    for(int i = 1; i<count; i++) {
	    	
	    	str+=word+separator;
	    }
	    
	    System.out.println(str+word);
	    
	  }
	}
package HomeWork;

import java.util.Scanner;

public class HomeWork_075_WitOutX {

	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    String word1 = word.toUpperCase();
		    
		    if(word1.charAt(0)=='X'		&& word1.charAt(word.length()-1)=='X'				) {
		    	
		    	System.out.println(word.substring(1,word.length()-1));
		    	
		    }else if(word1.charAt(0)=='X'		&& word1.charAt(word.length()-1)!='X'				) {
		    	
		    	System.out.println(word.substring(1));
		    	
		    }else if(word1.charAt(0)!='X'		&& word1.charAt(word.length()-1)=='X'				) {
	    	
	    	System.out.println(word.substring(0,word.length()-1));
	    	
	    } else
	    	System.out.println(word);
	    
	    
		  }
}

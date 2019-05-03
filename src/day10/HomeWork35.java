package day10;

import java.util.Scanner;

public class HomeWork35 {
	public static void main(String[] args) {
		
	    Scanner s = new Scanner(System.in);
	    String word1 = s.next();
	    String word2 = s.next();
	    
	    if(word1.contentEquals(word2)){
	    	
	    	System.out.println("word1=\""+word1+ "\"");
	    	System.out.println("word2=\""+word2+"\"");
	    	System.out.println();
	    	System.out.println("word1 equals word");
	    	
	    }else
	    	System.out.println("word1 does not equal word2");
	    

		
	}

}

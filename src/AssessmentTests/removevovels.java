package AssessmentTests;

import java.util.Scanner;

public class removevovels {
	

	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		    
		    String vovels="aeiou";
		    String result="";
		    
		    for(int i=0; i<word.length(); i++) {
		    	if(vovels.contains(""+word.charAt(i))) {
		    		result+=word.charAt(i);
		    	}
		    }
		    System.out.println(result);
		    
		  }
		}

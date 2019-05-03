package day10;

import java.util.Scanner;

public class HomeWork40 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("what is the farthest planet in the solar system:" );
	    System.out.println("a)venus" );
	    System.out.println("b)pluto" );
	    System.out.println("c)neptune" );
	    
	    String str = s.nextLine();
	    
	    if (	str.equals("a")	||	str.equals("c")	)	
	    	
	    	System.out.println(str +" is wrong");
	    
	    else if (	str.equals("b")	)	
	    	
	    	System.out.println(str +" is correct");
	    
	    else
	    	System.out.println(str +" is not a valid answer");
	  
	}

}

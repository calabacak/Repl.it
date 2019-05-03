package HomeWork;

import java.util.Scanner;

public class HomeWork_146_Methods8_Split {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
	  }
	  
	   public static void person(String info) 
		{
		
			//your code here
		   //person("jon,doe,30");
		   
		  String [] str = info.split(",");
		  
		  String name= str[0];
		  String lastname=str[1];
		  String age= str[2];
	
		   
			System.out.println("person name: "+name+" last name: "+lastname+" age: "+age);
		
		}//end person
	  
	}



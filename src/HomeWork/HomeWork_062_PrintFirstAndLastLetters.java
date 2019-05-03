package HomeWork;

import java.util.Scanner;

public class HomeWork_062_PrintFirstAndLastLetters {

	  public static void main(String[] args) {
		    //DO NOT CHANGE
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		   
		   System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
//		    System.out.print(word.charAt(0));
//		    System.out.println(word.charAt(word.length()-1));
		  }
		}

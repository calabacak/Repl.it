package HomeWork;

import java.util.Scanner;

public class HomeWork_154_isNumberPalindrome {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
	  }
	  
	  public static void isPalindrome(int num){
	    //WRITE YOUR CODE HERE
		  int reverse=0;
		  int remainder=0;
		  int palindrome=num;
		  while(palindrome!=0) {
			  remainder= palindrome%10;
			  reverse = reverse*10 + remainder;
			  palindrome=palindrome/10;
		  }
	    if(reverse==num) {
	    	System.out.println(true);
	    }else {
	    	System.out.println(false);
	    }
	    
	  }
	}

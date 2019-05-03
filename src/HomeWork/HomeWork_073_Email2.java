package HomeWork;

import java.util.Scanner;

public class HomeWork_073_Email2 {

	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		    String fn = email.substring(0, email.indexOf('_'));
		    
		    String fnc=fn.substring(0, 1).toUpperCase() + fn.substring(1);// first letter capital
		    
		    String ln = email.substring(email.indexOf('_')+1, email.indexOf('@'));
		    
		    String lnc=ln.substring(0, 1).toUpperCase() + ln.substring(1);// first letter capital
		    
		    String dm = email.substring	(		email.indexOf('@')+1, email.indexOf('.')			);
		    
		    String tdm = email.substring(email.indexOf('.')+1);
		    
		    System.out.println("First name: " + fnc);
		    System.out.println("Last name: " + lnc);
		    System.out.println("Domain: " + dm);
		    System.out.println("Top-Level Domain: " + tdm);
		    
		    
		    
		  }
		}

//Example:
//Input: craig_federighi@apple.com
//Output: 
//First name: Craig
//Last name: Federighi
//Domain: apple
//Top-Level Domain: com
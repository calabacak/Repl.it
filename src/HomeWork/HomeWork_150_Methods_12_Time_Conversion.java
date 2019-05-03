package HomeWork;

import java.util.Scanner;

public class HomeWork_150_Methods_12_Time_Conversion {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    timeConversion(scan.nextLine());
	    
	  }
	  
	  public static void timeConversion(String s) {
	    /*Write your code here.
		*/
		  if(s.substring(0, 2).contains("12") && s.contains("AM")) {
			  System.out.println("00"+s.substring(2, s.length()-2));
		  }else if(s.contains("AM")) {
			  System.out.println(s.substring(0, s.length()-2));
		  }else if(s.substring(0, 2).contains("12") && s.contains("PM")){
			  System.out.println(s.substring(0, s.length()-2));
		  }else if(s.contains("PM")){
			  int pm= Integer.parseInt(s.substring(0, s.indexOf(":")));
			  pm=pm+12;
			  String spm= String.valueOf(pm);
			  System.out.println(spm+s.substring(s.indexOf(":"), s.length()-2));
		  }
			 
			 
	  }
	}

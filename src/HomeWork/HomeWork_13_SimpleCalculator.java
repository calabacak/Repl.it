package HomeWork;

import java.util.Scanner;

public class HomeWork_13_SimpleCalculator {

	
	
	public static void main(String[] args) {
	      
	      plus();
	  }
	  
	  public static void plus(){
	     
	   Scanner scan= new Scanner(System.in);
	   System.out.println("enter first number:");
	   int fn=scan.nextInt();
	   System.out.println(fn);
	   System.out.println("enter second number:");
	   int sn=scan.nextInt();
	   System.out.println(sn);
	   System.out.println("result :"+fn+sn);
	  }
	  
	

}

package day11_logical_nestedif;

import java.util.Scanner;

public class HomeWork41 {
	public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter age:");
	    int age = scan.nextInt();
	    if ((age<2) || (age>18)) {
	    	System.out.println(age + ", ineligible");
	    }
	    else if (age==2) {
	    	System.out.println(age + ", toddler");
	    }
	    else if (	(age==3)	||	(age==4)	|| (age==5)	) {
	    	System.out.println(age + ", early childhood");
	    }
	    else if (	(age==6)	||	(age==7)	) {
	    	System.out.println(age + ", young reader");
	    }
	    else if (	(age==8)	||	(age==9)	|| (age==10)	) {
	    	System.out.println(age + ", elementary");
	    }
	    else if (	(age==11)	||	(age==12)	) {
	    	System.out.println(age + ", middle");
	    }
	    else if (age==13) {
	    	System.out.println(age + ", impossible");
	    }
	    else if (	(age==14)	||	(age==15)	|| (age==16)	) {
	    	System.out.println(age + ", high school");
	    }
	    else if (	(age==17)	||	(age==18)	) {
	    	System.out.println(age + ", scholar");
	    }	

	  //  scan.close();
	}

	  }
	



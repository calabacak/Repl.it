package day16_string_manipulation;

import java.util.Scanner;

public class javabookexamplesforloop {
	public static void main(String[] args) {
//		int sum = 0;
//		for (int next = 0; next <= 10; next = next + 2)
//		{
//		     sum = sum + next;
//		     System.out.println("sum now is " + sum);
//		}
		
//		int product = 1, number;
//		for (number = 1; number <= 10; number++);
//		{
//		     product = product * number;
//		}
//		System.out.println("Product of the numbers 1 through " +
//		                   "10 is " + product);
//		
//		 for (double test = 0; test < 3; test = test + 0.5)
////		        System.out.println(test);
//		for(int i=0;i<=10; i=i+2){
//			System.out.println(i);
		
//		 for (int count = 0; count <= 3; count++)
//		        for (int count2 = 0; count2 < count; count2++)
//		            System.out.println(count2);
		
		//enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES}
		 
//		//To display these suits, you can write the following for-each loop:
//		for (Suit nextSuit : Suit.values())
//		     System.out.print(nextSuit + " ");
//		System.out.println();
		
		//The code for computing the highest and lowest scores could be as follows:
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter your score, if negative exit");
//		int score = scan.nextInt();
//		int maxScore = 0;
//		int minScore = 100;
//		//89	23	2476	35
//		while(score>0) {
//			
//			System.out.println("You entered " + score);
//			
//			if(score>maxScore)
//				maxScore=score;
//			else if (score<minScore)
//				minScore= score;
//			System.out.println("enter your score, if negative exit");
//			score = scan.nextInt();
//			
//		}
//		
//		System.out.println("max score is " + maxScore);
//		System.out.println("max score is " + minScore);
		
		//Scanner scan = new Scanner(System.in);
		
//		System.out.println("one more time");
//		int count =1;
//		
//		while(count<=3) {
//			System.out.println("one more time");
////			count= count+1;
//		int result =1;
//		
//		while(result<32) {
//			
//			result= result*2;
//					System.out.println("being multiplied");
//			
//			
//		}
//		
//////			
//////		}
//		double number;
//		double sum=0;
//		int count = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a number, if want to exit enter negative");
//		number= scan.nextDouble();
//		while(number>=1.0) {
//			
//			System.out.println("you entered " + number);
//			if (number>=1.0) { 
//				sum = sum + number;
//			count= count +1;
//			System.out.println("enter a number, if want to exit enter negative");
//			number= scan.nextDouble();
//			}else {
//				System.out.println("I undersatand you want to exit ");
//			
//			}
//				
//
//	}
//		
////		System.out.println("avarage is " + sum);
//		for (int n = 1; n <= 3; n++)
//		{
//		switch (n)
//		{
//		case 1:
//		             System.out.println("One");
//		             break;
//		          case 2:
//		             System.out.println("Two");
//		             break;
//		          case 3:
//		             System.out.println("Three");
//		             break;
//		          default:
//		             System.out.println("Default case");
//		break; }
//		    }
//		    System.out.println("After the loop");
		
//		for (int n = 1; n <= 5; n++)
//		{
//		if (n == 3)
//		          break;
//		       System.out.println("Hello");
//		    }
////		    System.out.println("After the loop");
//		
//		
//		for (int n = 1; n <= 5; n++)
//		{
//		if (n == 3)
//		          System.exit(0);
//		       System.out.println("Hello");
//		    }
//		    System.out.println("After the loop");
		
/////////////////////////////////////////////////////////////////////////////////////////
//1. Writeafragmentofcodethatwillreadwordsfromthekeyboarduntiltheword done is entered. 
//For each word except done, report whether its first character is equal 
//to its last character. For the required loop, use a
//1. while statement
////2. do-while statement
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a word");
//		String input = scan.next();
//		if(input.charAt(0)==input.charAt(input.length()-1))
//			System.out.println("first and last chars equal");
//		while(!input.equals("done")) {
//			System.out.println("you have entered "+ input+ " enter another word");
//			input = scan.next();
//				if(input.charAt(0)==input.charAt(input.length()-1))
//					System.out.println("first and last chars equal");
//				//else
//					//System.out.println("first and last chars NOT equal");
//			
//			 if (input.equals("done")) {
//				break;
//			}
//			
//			
//		}
//		System.out.println("exited");
		
/////////////////////////////////////////////////////////////////////////////////////////		
		
//		Writeafragmentofcodethatwillcomputethesumofthefirstnpositiveodd integers. 
//		For example, if n is 5, you should compute 1 + 3 + 5 + 7 + 9.
//		
		int sum = 0;
		int n =5;
		for (int i = 1; i<= 2*n-1; i=i+2) {
			sum=sum+i;
			System.out.println("sum is being calculated " +sum);
			
		}
////		System.out.println(sum);
//		while( n<10) {
//			sum=sum+n;
//			n=n+2;
//			System.out.println("sum is being calculated " +sum);
//		}
//		System.out.println("sum is  " +sum);
		
		
//		int sum = 0;
//		
//		int n=5;
//		int i;
//		
//		for (i = 1; i <= 2*n-1; i=i+2 ) {
//			
//		
//		System.out.println("the values to be added are = "+ i);
//		sum = sum + i;
//		}
//		System.out.println(sum);
	}

}

//WriteaJavaloopthatwillreadalistofnumbersoftypedoubleandthendisplay their average. 
//The numbers are all greater than or equal to 1.0. The input data ends with a sentinel value, which you must specify. 
//Also give any declarations or initializing statements that are needed.

//WriteaJavaloopthatwillsetthevariableresultequalto25.
//Initializethevalue of result to 1 and then multiply it by 2 for each of five loop iterations. 
//Also give any declarations or initializing statements that are needed.
////Writeaforstatementthatdisplaystheevennumbers2,4,6,8,and10.
//Each number should appear on a separate line. Declare all the variables you use.


//
//WriteaJavaloopthatwilldisplaythephraseOnemoretimefourtimes.
//Also give any declarations or initializing statements that are needed.
//
//
//




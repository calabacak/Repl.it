package day16_string_manipulation;

import java.util.Scanner;

public class javabookexamples {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String answer;
		do {
		System.out.println("enter the scores, if you enter a negative score that means the end ");
		
		int score = keyboard.nextInt();
		int sum = 0;
		int count =0;
				while(score>0) {
					sum = sum + score;
					count = count +1;
					System.out.println("enter next score or negative score to exit  ");
					score = keyboard.nextInt();
					
				}
		
		System.out.println("you entered " + count+ " scores, and the avarege is "+ sum/count);
		System.out.println("would you like to go on?");
		answer = keyboard.next();
		
		}while (answer.equalsIgnoreCase("yes"));
//		
//		System.out.println("enter population");
//		
//		int population = keyboard.nextInt( );
//		while(population<0)	{
//			
//			System.out.println("you entered " +population + " it is a negative number enter a positive number");
//			population = keyboard.nextInt( );
//		}
//		System.out.println("the population you entered is = "+ population);
	}

}


////Computes the average of a list of (nonnegative) exam scores. 
//Repeats computation for more exams until the user says to stop.



//System.out.print("Enter the population of the city: ");
//int population = keyboard.nextInt( );
//Write a while loop after these statements that ensures that population is positive. 
//If the user enters a population that is either negative or zero, ask the user to enter a nonnegative value.
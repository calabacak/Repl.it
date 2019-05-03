package HomeWork;

import java.util.Scanner;

public class HomeWork083_Guest_List_DO_WHILE {
	public static void main(String[] args) {
		
		String list="";
		String answer="";
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Please enter guest name:");
			 String name = input.next();
			 list = list + name + ", "; 
			System.out.println("Do you want to enter new guest name:");
			answer = input.next();
		}while(answer.contentEquals("yes"));	
			System.out.println("Guest's list: "+list.substring(0,list.length()-2));
		
	}

}

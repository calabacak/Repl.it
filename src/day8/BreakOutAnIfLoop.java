package day8;

import java.util.Scanner;

public class BreakOutAnIfLoop {
	public static void main(String[] args) {
		char grade;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your grade");
		grade = scan.next().toUpperCase().charAt(0);
		
		if (grade!= 'A'&&(grade!= 'B')&&(grade!= 'C'&&(grade!= 'D'))) {
			System.out.println("Please enter either A or B or C or D");
			main(null);
		}
		
		else if (grade== 'A'){
			System.out.println("Excellent Job");
			
		}

		else if ((grade!= 'B')||(grade!= 'C'||(grade!= 'D'))) {
			System.out.println("how many points did you miss for 'A'");
			int points = scan.nextInt();
			System.out.println("your grade is "+ grade);
			System.out.println("you could earn " +points+ " more points if you studied harder");
			
		}
		}
	
}

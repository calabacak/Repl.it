package day07_Scanner;

import java.util.Scanner;

public class Adding_Numbers {

	public static void main(String[]args) {


		//WRITE YOUR CODE HERE:
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		int x,y,z,t;
		x = keyboard.nextInt();
		y = keyboard.nextInt();
		z = keyboard.nextInt();
		t=x+y+z;
		System.out.println(t);

	}
}
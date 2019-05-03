package day10;

import java.util.Scanner;

public class denem {
public static void main(String[] args) {
	
	int [] scores = new int[4];
	
	scores [0] = 80;
	scores [1] = 75;
	scores [2] = 95;
	scores [3] = 90;
	
	for (int i = 0; i<scores.length; i++) {
		System.out.println(scores[i]);
		System.out.println("=================");
	}
	int sum = 0;
	int avarege= 0;
		for (int j = 0; j<scores.length; j++) {
		sum = sum + scores[j];
		 avarege = sum/(scores.length);
	
	}
	
System.out.println("Avarege score of " +scores.length+ " students is " + sum/(scores.length));
	
}
}



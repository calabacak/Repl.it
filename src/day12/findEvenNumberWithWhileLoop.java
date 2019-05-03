package day12;

import java.util.Scanner;

public class findEvenNumberWithWhileLoop {
public static void main(String[] args) {
	
	int numStart;
	int numEnd;
	int count=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number");
	
	numStart = scan.nextInt();
	numEnd = scan.nextInt();
	
//	numStart = 4;
//	numEnd = 20;
	
	
	while(numStart<numEnd) {
		if(numStart%2==0) {
			//System.out.println(numStart + " is even");
			count = count+1;System.out.println(numStart + " is even");
			if (count==5) {;
				break;
			}
		}numStart = numStart + 1;
	}System.out.println(numStart + "  " + count);
	
	
}
}

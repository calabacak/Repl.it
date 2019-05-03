package HomeWork;

import java.util.Scanner;

public class HomeWork_092_Factorial {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    long faktoriyel=1;
	    
	for (int i = n; i > 0; i--) {
		
		faktoriyel=faktoriyel*i;
		
	}
	    
	    System.out.println(faktoriyel);
		
		
	}

}

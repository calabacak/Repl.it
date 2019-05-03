package HomeWork;

import java.util.Scanner;

public class BGE_Bill_Calculator {
	public static void main(String[] args) {
		
		
		double totalPrice;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of kW⋅h:");
		
		double input = scan.nextDouble();
		
		if (input<=200) {
			totalPrice=100;
			System.out.println("Your bill this month is: $"+totalPrice);
		}else if (input<=275) {
			totalPrice=100+0.40*(input-200);
			System.out.println("Your bill this month is: $"+totalPrice);
		}else if (input>275 && input<=400) {
			totalPrice=100+ 75*0.40 +	0.35*(input-275) 	;
			
			System.out.println("Your bill this month is: $"+totalPrice);
		}else if (input>400)  {
			totalPrice=100+ 75*0.40 +	0.35*(125) + 0.25*(input-400)	;
			
			System.out.println("Your bill this month is: $"+totalPrice);
		}
				
				
		
		
	}

}

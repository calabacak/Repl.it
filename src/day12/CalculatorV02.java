package day12;

import java.util.Scanner;

public class CalculatorV02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num1, num2;
		double result = 0;
		String operator = "null";

		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.println("Select Operator either add for +, minus for -, multiply for *, divide for / and remainder for %");
		
		operator = scan.next();
		
		switch(operator) {
		case "add" :
			result = num1+num2;
			break;
		case "minus" :
			result = num1-num2;
			break;
		case "multiply" :
			result = num1*num2;
			break;
		case "divide" :
			result = num1/num2;
			break;
		case "remainder" :
			result = num1%num2;
			break;
		default : System.out.println("Invalid Input");
			return;
		
		}
		
		System.out.println("the result is = " + result);
		
	}

}

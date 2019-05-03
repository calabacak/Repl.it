package day12;

import java.util.Scanner;

public class CalculatorV01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double num1, num2;
		double result = 0;
		String operetor;
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();		
		System.out.println("Select Operation either + - * / %");
		
		operetor = scan.next();
		
			if(operetor.equals("+"))	{result = num1+num2;System.out.println("The result is : " + result);}
		else if(operetor.equals("-"))	{result = num1-num2;System.out.println("The result is : " + result);}
		else if(operetor.equals("*"))	{result = num1*num2;System.out.println("The result is : " + result);}
		else if(operetor.equals("/"))	{result = num1/num2;System.out.println("The result is : " + result);}
		else if(operetor.equals("%"))	{result = num1%num2;System.out.println("The result is : " + result);}
		else {System.out.println("Invalid Operator " +operetor);}	
		//else {System.out.println("Invalid Operator " +operetor); return;} 
			//System.out.println("The result is : " + result);
	}

}

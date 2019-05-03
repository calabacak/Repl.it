package day31_methods3;

public class SuperAdder {
	public static void main(String[] args) {
		
		int num1=10;
		int num2=15;
		double num3=2.7;
		double num4= 5.6;
		double num5= 7.4;
		int num6=15;
		
		int a = MathApplication.addNumbers(num1, num2);
		double b = MathApplication.addNumbers(num3, num4);
		int c =MathApplication.addNumbers(num5, num6);
		
		System.out.println(a+"\n"+b+"\n"+c);
		System.out.println(a+"\t"+b+"\t"+c);
	}

}

package day46_static_keyword;

public class CalcTest {
	public static void main(String[] args) {
		
		double result = Calculator.plus(55, 7);// static way, we dont need an object to call the method
		System.out.println(result);
		
		result= Calculator.minus(44, 14);
		System.out.println(result);
		
		Calculator c = new Calculator();
		System.out.println(c.multiply(6, 8));
		
	}

}

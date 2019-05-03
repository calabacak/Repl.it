package day30_methods2;

public class CalculatorV2 {
	public static void main(String[] args) {
		System.out.println(add(7.6, 5.6));
		divide(3,0) ;

	}

	public static double add(double a, double b) {
		return (a + b);
	}

	public static double subtract(double a, double b) {
		return (a - b);
	}

	public static double multiply(double a, double b) {
		return (a * b);
	}

	public static double divide(double a, double b) {
		if(b==0) {
			System.out.println("can not divide by 0");
			return -1;
		}
		return (a / b);
	}

}

package day31_methods3;

public class MathApplication {
	public static void main(String[] args) {
		
		System.out.println(addNumbers(3,4));
		System.out.println(addNumbers(3.4,4.5));
		System.out.println(addNumbers(3.4,10));
	}
	// add two int values and return int
	public static int addNumbers(int num1, int num2) {
		return(num1+num2);
	}
		// add two int values and return int
		public static double addNumbers(double num3, double num4) {
			return(num3+num4);		
	}
		// add one int and one double values and return int
		public static int addNumbers(double num5, int num6) {
			return (int)(num5+num6);
		}

}

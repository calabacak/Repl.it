
public class AdditionAndMethodOverloading {
	
	public static void main(String[] args) {
		
		addNumbers(1,2,3);
		addNumbers(5,6, "cengiz");
		
	}
	public static double addNumbers(double num1, double num2, double num3) {
		
		double sum;
		sum = num1 + num2 + num3;
		
		System.out.println("The sum is = " + sum);
		
		return sum;
		
	}
	public static double addNumbers(double num1, double num2, String name) {
		
		double sum2;
		sum2 = num1 + num2;
		
		System.out.println("The sum2 is = " + sum2 + " and name is "+ name);
		
		return sum2;
		
	}
	
	

}

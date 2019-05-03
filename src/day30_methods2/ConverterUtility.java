package day30_methods2;

public class ConverterUtility {
	public static void main(String[] args) {
	System.out.println(milestokm(2.9));
	System.out.printf("%.2f", milestokm(2.9));
	
	
	//	Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.	
		
		System.out.println(fahrenheitToCelsius(78));
		
		
	}
	
	public static double milestokm(double miles) {
		
//		double result =(miles*1.609);
//		return result;
		
		return CalculatorV2.multiply(miles, 1.609);
		
		
	}
	
	public static int fahrenheitToCelsius(int fahrenheit) {
		
		int result =  (fahrenheit-32)*5/9;
		return result;
	}

}

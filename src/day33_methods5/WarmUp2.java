package day33_methods5;

public class WarmUp2 {
	
	public static void main(String[] args) {
	int num1=56;
	int num2=35;
	addvoid( num1,  num2);	
	System.out.println("=============");
	System.out.println(addreturn(num1,num2));
	
	
	}
	

	
	public static void addvoid(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
	
	public static int addreturn(int num1, int num2) {
		return(num1+num2);
	}
	

}

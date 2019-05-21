package day45_encapsulation_practice;

public class MyTernary {
	public static void main(String[] args) {
		
		//return_value = (true-false condition) ? (if true expression) : (if false expression);
		//type of the return value should be same as expressions
		// true-false condition is nothing but if condition
		
		int x=5;
		int y=10;
		
		boolean z= (x==y)? true : false;
		
		System.out.println(z);
	}

}

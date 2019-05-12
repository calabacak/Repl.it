package day37_ArrayList;

public class MentoringPractise1 {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Selenium";
		int i = 5;
//		saySomething(str, i);
//		add(5,7);
		saySomething(str1);
	
		
		// find out the tax amount for the sum of the salaries;
		
		double tax= add(5,7)*10/100;
		//System.out.println(tax+"$");

	}

	public static void saySomething() {
		System.out.println("I love Java");
	}

	public static void saySomething(String word) {
		System.out.println("I love " + word);
		System.out.println("==========");
		saySomething("Selenium",3);
	}

	public static void saySomething(String word, int num) {

		for (int i = 0; i < num; i++) {
			System.out.println("I love " + word);
		}
	}
	
	public static double add(double Salary1, double Salary2) {
		//System.out.println(Salary1+Salary2);
		return Salary1+Salary2;
	}

}

package SpecialTopics;

public class ST_30_SwapData {
	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		System.out.println("before");
		System.out.println("a:=" +a+ " | b: "+b);
		a= a+b;//15;
		b=a-b;//10;
		a=a-b;//5;
		
		System.out.println("after");
		System.out.println("a:=" +a+ " | b: "+b);
	}

}

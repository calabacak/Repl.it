package SpecialTopics;

public class ST_13_SwapData {
	public static void main(String[] args) {
		
		
		////WITHOUT TEMP//////
		int a = 10;
		int b =  5;
		
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		/////////////////WITH TEMP/////////
		
		int d =10;
		int e = 5;
		int temp=d;
		d=e;
		e=temp;
		
		System.out.println("old d is 10 "+"and new d = "+d);
		System.out.println("old e is 5 "+"and new e = "+e);
		
		
		
	}

}

package day36_Wrappers_Array_Lists;

public class WrapperClasses {
	
	public static void main(String[] args) {
		int n1=10;
		Integer n2=new Integer(20);
		
		System.out.println(n1);
		System.out.println(n2);
		
		double d1= 44.5;
		Double d2= new Double(123.4);
		Double d3= new Double("5.2");
	
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		
		char ch1= 'a';
		Character ch2= new Character('b');
		System.out.println(ch1);
		System.out.println(ch2);
		
		Integer num1= Integer.valueOf(1234);
		Boolean bool1= Boolean.valueOf(true);
		
		
	}

}

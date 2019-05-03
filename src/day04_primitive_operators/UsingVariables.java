package day04_primitive_operators;

public class UsingVariables {
	public static void main(String[]args) {
		
		int num1,num2,num3;
		
		num1=100;
		num2=num1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		num2=200;
		num1=num2;
		num3=num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println("=====================");
		//declare apples and assing 25
		int apples=25;
		
		// declare kiwis and assign value of apples to it
		int kiwis=apples;
		
		// declare mangos and assign 
		int mangos=55;
		
		//assign mangos to kiwis
		
		kiwis=mangos;
		
		System.out.println(apples);
		System.out.println(kiwis);
		System.out.println(mangos);
	
		
		
		
		
		
		
		
		
			
			
	}

}

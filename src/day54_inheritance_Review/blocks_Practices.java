package day54_inheritance_Review;

public class blocks_Practices {
	static String names;
	
	static {
		names="John";
	}
	
	{
		names ="Aaron";
	}
	public blocks_Practices() {
		names="Muradil";
	}
	
	
	 int num1=10;
	static int num2=10;
	
	public static void main(String[] args) {
		
		
		blocks_Practices obj =new blocks_Practices();
					obj.num1 = 20; 
					obj.num2 = 20;
					
		blocks_Practices obj2 =new blocks_Practices();
			System.out.println(obj2.num1);  // 10
			System.out.println(obj2.num2);  // 20
			System.out.println(names);
	}

}

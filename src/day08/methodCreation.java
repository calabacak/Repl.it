package day08;

public class methodCreation {
	
	public static void main(String[] args) {
		
		int b = 4;
		int c = 15;
		//abc(4,15);
		int d = abc(b,c);
		System.out.println(d);
		
	}	

	
	public static int abc(int b,int c ) {
		
		b = 4;
		c = 15;
		int a = b*c;
		//System.out.println("a = "+ a);
//		if (a>20) {
//		System.out.println("a is greater than 20");
		return a;
	//}
		
	
}
}
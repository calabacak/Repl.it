package day31_methods3;

public class CountUpandDownMethods {
	public static void main(String[] args) {
		countUp(5);
		System.out.println();
		countDown(10);
		
		
	}
	
	public static void countUp(int num) {
		for(int i=1; i<=num;i++) {
			System.out.print(i+" ");
		}
	}
	
	public static void countDown(int num) {
		for(int i=num; i>=1;i--) {
			System.out.print(i+" ");
		}
	}
	
	

}

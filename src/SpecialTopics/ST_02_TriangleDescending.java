package SpecialTopics;

public class ST_02_TriangleDescending {
	public static void main(String[]args) {
		
		getTriangleDescending(10);
	}
	
	
	
	public static void getTriangleDescending(int num) {
		
		for(int i = num; i>=0; i--) {
			for(int j =0; j<=i; j++) {
				System.out.print(j); //"*"
				
			} System.out.println();
			
		}
		
		
		
	}
	
	
	

}

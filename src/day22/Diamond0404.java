package day22;

public class Diamond0404 {
	public static void main(String[] args) {
		
		int i = 0;
		while (i <= 5) {//////
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}for (int k = 1; k <= 2*i+1; k++) {
				System.out.print("*");
			} System.out.println();
			 i++;}////////////
		
		int m=4;
		
		while (m >=0) {
			for (int j = 4; j >= m; j--) {
				System.out.print(" ");
			}for (int k = 1; k <= 2*m+1; k++) {
				System.out.print("*");
			} System.out.println();
			 m--;}///////////////////
		
	
	}

}

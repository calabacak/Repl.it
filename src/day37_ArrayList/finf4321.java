package day37_ArrayList;

public class finf4321 {
	public static void main(String[] args) {
		
		for(int i=4; i>=1; i--) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k>0; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		for(int i=5; i>=0; i-- ) {
			for(int j=0; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=0; i<=5; i++ ) {
			for(int j=0; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
	}

}

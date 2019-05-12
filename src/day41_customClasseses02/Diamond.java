package day41_customClasseses02;

public class Diamond {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 4; i >=0; i--) {
			for (int j=4 ; j>i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

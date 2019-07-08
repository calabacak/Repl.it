package day59_polymorphism;

public class Triangle extends Shape{
	@Override
	public void draw() {
	    int i, j, k;
        for (i = 0; i < 10 + 1; i++) { for (j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}

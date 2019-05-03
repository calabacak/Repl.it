package HomeWork;

public class HomeWork_109_Compute {
	public static void main(String[] args) {

		int k = 1;
		int total = 0;
		int number = 5;

		do {
			total += k * k;
			k++;
		}
		while (k <= 50);

		System.out.println(total);

	}

}

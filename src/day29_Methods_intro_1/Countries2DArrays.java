package day29_Methods_intro_1;

import java.util.Arrays;

public class Countries2DArrays {
	public static void main(String[] args) {

//		USA	Washington DC
//		Canada	Ottawa
//		Mexico	Mexico city
//		Mexico	Brasilia
//		Peru	Lima
//		Argentina	Boanes Aeros
//		Bolivia	La Paz
//		Macedonia	Scopia
//		Kazakhstan	Nursultan

		String[][] countriesArray = new String[9][2];

		countriesArray[0] = new String[] { "USA", "Washington DC" };
		countriesArray[1] = new String[] { "Canada", "Ottawa" };
		countriesArray[2] = new String[] { "Mexico", "Mexico City" };
		countriesArray[3] = new String[] { "Brasil", "Brasilia" };
		countriesArray[4] = new String[] { "Peru", "Lima" };
		countriesArray[5] = new String[] { "Argentina", "Boanes Aeros" };
		countriesArray[6] = new String[] { "Bolivia", "La Paz" };
		countriesArray[7] = new String[] { "Macedonia", "Scopia" };
		countriesArray[8] = new String[] { "Kazakhstan", "Nursultan" };

		System.out.println(countriesArray[0][0] + " - " + countriesArray[0][1]);

		System.out.println(Arrays.deepToString(countriesArray));

		for (int i = 0; i < 9; i++) {
			if (i == 8) {
				System.out.print(countriesArray[i][0]);
			} else
				System.out.print(countriesArray[i][0] + " - ");

		}

		System.out.println();

		for (int i = 0; i < countriesArray.length; i++) {
			if (countriesArray[i][0].equals("Bolivia")) {
				// System.out.println(countriesArray[i][1]);
				if (countriesArray[i][1].contentEquals("La Paz")) {
					System.out.println("bolivia test passed");
				} else {
					System.out.println("failed");
				}
				break;
			}
		}

		// System.out.println(countriesArray.length);

	}

}

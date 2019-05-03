package day24;

public class PractiseTwoDimensional {
	public static void main(String[] args) {

		int[][] numbers = { { 90, 10, 231 }, { -20, 80, 100, 23, 54 }, { 45, 22 }, { 87, 98, -100, 49, 73, 35, 19 } };

		System.out.println("number of rows are "+numbers.length);
		
		int numOfElements=0;
		for(int i = 0; i< numbers.length; i++) {
			
			numOfElements += numbers[i].length;
		}
		
		System.out.println("total number of elememets are "+ numOfElements);
		
		
		
		int[] numbers1 = new int[7];

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j <= 2; j++) {
				numbers1[j] = numbers[i][j];
			}

//			for(int element : numbers1) {
//				System.out.println(element);
//			}
		}

		int[] numbers2 = new int[7];
		for (int i = 1; i < 2; i++) {
			for (int j = 0; j <= 4; j++) {
				numbers2[j] = numbers[i][j];
			}
		}

		int[] numbers3 = new int[7];
		for (int i = 2; i < 3; i++) {
			for (int j = 0; j <= 1; j++) {
				numbers3[j] = numbers[i][j];
			}
		}
		int[] numbers4 = new int[7];
		for (int i = 3; i < 4; i++) {
			for (int j = 0; j <= 6; j++) {
				numbers4[j] = numbers[i][j];
			}
		}

		int[] newNumbers = new int[numbers1.length + numbers2.length + numbers3.length + numbers4.length];
		// System.out.println(newNumbers.length);

		for (int i = 0; i < newNumbers.length; i++) {
			for (int j = 0; j < numbers1.length; j++) {
				newNumbers[j] = numbers1[j];
			}
		}
		for (int i = 0; i < newNumbers.length; i++) {
			for (int j = numbers1.length; j < numbers1.length + numbers1.length; j++) {
				newNumbers[j] = numbers2[j - numbers1.length];
			}
		}

		for (int i = 0; i < newNumbers.length; i++) {
			for (int j = 2 * numbers1.length; j < numbers1.length + 2 * numbers1.length; j++) {
				newNumbers[j] = numbers3[j - 2 * numbers1.length];
			}
		}
		for (int i = 0; i < newNumbers.length; i++) {
			for (int j = 3 * numbers1.length; j < numbers1.length + 3 * numbers1.length; j++) {
				newNumbers[j] = numbers4[j - 3 * numbers1.length];
			}
		}
		

		
		

//		for (int element:newNumbers) {
//			
//			System.out.println(element);
//		}

		int temp;
		for (int i = 0; i < newNumbers.length; i++) {
			for (int j = i + 1; j < newNumbers.length; j++) {

				if (newNumbers[j] > newNumbers[i]) {

					temp = newNumbers[j];
					newNumbers[j] = newNumbers[i];
					newNumbers[i] = temp;
				}

			}
		}
		for (int element : newNumbers) {

			if (element == 0) {// to getrid of zeros,
				continue;
			}

			System.out.println(element);
		}

	}

}

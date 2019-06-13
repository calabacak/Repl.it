package HomeWork;
//home 227
import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork_227_PrimeNumbers {
	public static void main(String[] args) {

		//System.out.println(isPrime(97));
		
		System.out.println(Arrays.toString(generateTable(5, 5)));
		
//		ArrayList<Integer> list1 = new ArrayList<>();
//		System.out.println(list1.size());

	}

	public static boolean isPrimev2(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					return false;
				}
			}

		}
		return true;
	}

	public static boolean isPrime(int number) {
		if (number <= 0 || number == 1) {
			return false;
		}

		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static int[] generateTable(int start, int numberOfEntries) {

		ArrayList<Integer> list1 = new ArrayList<>();
		int[] arr = new int[numberOfEntries];

		while (list1.size() <= numberOfEntries) {
			if (isPrime(start)) {
				list1.add(start);
				start++;
			}
			start++;
		}
		
		for(int i=0; i<numberOfEntries;i++) {
			arr[i]= list1.get(i);
		}
		return arr;
	}
	
	public static boolean checkTable(int start, int[] tableToTest) {
	             
	       return (Arrays.equals(generateTable(start, tableToTest.length), tableToTest));
	    }


}

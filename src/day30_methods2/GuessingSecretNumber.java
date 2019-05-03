package day30_methods2;

import java.util.*;

public class GuessingSecretNumber {
	public static void main(String[] args) {

		//guessByComputerSecretNumber();
		//guessByComputerSecretNumberLimit(5);
		guessByComputerVsMeSecretNumberLimit(5);

	}

	public static void guessByComputerSecretNumber() {
		Random random = new Random();
		int secretNumber = random.nextInt(11);
		int count = 0;
		do {
			count++;
			int guessNumber = random.nextInt(11);

			if (guessNumber == secretNumber) {
				System.out.println("You Won! SecretNumber is " + secretNumber + " GuessNumber is " + guessNumber
						+ " Counter: " + count);
				break;
			} else {
				System.out.println(
						"SecretNumber is " + secretNumber + " GuessNumber is " + guessNumber + " Counter: " + count);
			}

		} while (true);
	}

	public static void guessByComputerSecretNumberLimit(int limit) {

		Random random = new Random();
		int secretNumber = random.nextInt(11);
		int count = 0;
		limit = 5;
		do {
			count++;

			int guessNumber = random.nextInt(11);

			if (guessNumber == secretNumber) {
				System.out.println("You Won! SecretNumber is " + secretNumber + " GuessNumber is " + guessNumber
						+ " Counter: " + count);
				break;
			} else {
				System.out.println(
						"SecretNumber is " + secretNumber + " GuessNumber is " + guessNumber + " Counter: " + count);
			}
			if (count == limit) {
				System.out.println("You Lost! SecretNumber is " + secretNumber + " GuessNumber is " + guessNumber
						+ " Counter: " + count);
				break;
			}
		} while (true);

	}
	
	
	public static void guessByComputerVsMeSecretNumberLimit(int limit) {

		Random random = new Random();
		int secretNumber = random.nextInt(11);
		int count = 0;
		limit = 5;
		do {
			count++;
			Scanner scan= new Scanner(System.in);
			System.out.println("enter your guess");
			int guessNumber = scan.nextInt();

			if (guessNumber == secretNumber) {
				System.out.println("You Won! SecretNumber is " + secretNumber + " GuessNumber is " + guessNumber
						+ " Counter: " + count);
				break;
			} else {
				System.out.println(
						"Unfortunately NO" + " GuessNumber is " + guessNumber + " Counter: " + count);
			}
			if (count == limit) {
				System.out.println("You Lost! SecretNumber is " + secretNumber + " GuessNumber is " + guessNumber
						+ " Counter: " + count);
				break;
			}
		} while (true);

	}
	
	
	
	

}

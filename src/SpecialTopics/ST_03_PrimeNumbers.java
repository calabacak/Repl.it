package SpecialTopics;

public class ST_03_PrimeNumbers {
	public static void main(String[] args) {

		findPrimeNumbersInBetween(1, 120);
	}

	public static void findPrimeNumbersInBetween(int a, int b) {
		
		for (int i = a; i <= b; i++) {
			int count=0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println(i + " NOT PRIME");
					count++;
					break;
				}
			}if(count==0) {
				System.out.println("==="+i + "===IS PRIME");
			}

		}
		
		// give me the prime numbers between 20 and 80;
				int count=0;
				for(int i= 20; i<=80; i++) {
					count=0;// this is very important cengiz dont forget to put this.
					for(int j=2; j<i; j++) {
						
						if(i%j==0) {
							count++;
						}
						
					} if(count==0) {
						System.out.println(i+ " is a prime number");
					} else {
						System.out.println(i+ " is NOT a prime number");
					}
					
					
				}
		
		
		
		
		
		
		
		

	}
}
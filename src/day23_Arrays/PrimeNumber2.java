package day23_Arrays;

public class PrimeNumber2 {
	public static void main(String[] args) {
		//int count = 0;
		for (int i = 3; i < 100; i++) {
			for (int j =2; j < i; j++) {
				if(i%j==0) {
					System.out.println(i+ " is  NOT prime");
					break;
				}else System.out.println(i+" is prime");
					break;
				
			}
		}
				
		
	}

}

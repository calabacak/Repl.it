package day18_whiledowhileloops;

public class ComputeTheTotalNumberOfHandshakesThatOccur {
	public static void main(String[] args) {
		
		int numOfPeople= 100;
		
		int numOfHandShakes = 0;
		
		for(int i = numOfPeople-1; i>=1; i--) {
			
			System.out.println(i);
			
			numOfHandShakes= numOfHandShakes+i;
			
			
			//System.out.println(numOfHandShakes);
			
		}System.out.println(numOfHandShakes);
		
		
		int product = 1;
	    int max = 20;
	    for (int i = 0; i <= max; i++)
	         product = product * i;
	    System.out.println("The product is " + product);
		
		
	}

}

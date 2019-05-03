package day10;

public class fibonaccideneme {
	
	public static void main(String[] args) {
		
		int i, n = 15;
		
		int []fib = new int [n];
		fib[0]= 0;
		fib[1]= 1;
		
		for (i=2; i<n; i++) {
			
			fib[i] = fib[i-2] + fib[i-1];
					}

			for (i=0; i<fib.length; i++)System.out.println(fib[i] + " " );
		
		
	}

}

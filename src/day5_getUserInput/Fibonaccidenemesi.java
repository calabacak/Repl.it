package day5_getUserInput;

public class Fibonaccidenemesi {
	public static void main(String[] args) {
		
		int i=20;
		
		int[]fib= new int[i];
		
		fib[0]=0;
		fib[1]=1;
		
		for(i=2;i<fib.length;i++) {
			fib[i]=fib[i-1]+fib[i-2];	
			//System.out.print(fib[i]+" ");
		
	}
		
		for(i=0;i<fib.length;i++) {
				
			System.out.print(fib[i]+" ");
		
	}
		
		
	}

}

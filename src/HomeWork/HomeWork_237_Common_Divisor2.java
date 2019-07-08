package HomeWork;

import java.util.ArrayList;

public class HomeWork_237_Common_Divisor2 {
	public static void main(String[] args) {
		System.out.println(commonDivisor(60,80));
		
	}
	
	public static int commonDivisor(int m, int n){
	    //WRITE YOUR CODE HERE
		
		if(m<n) {
			for (int i =m; i>=1; i--) {
				
				if(m%i==0 && n%i==0) {
					return i;
				}
				
			}
		}
		
		else if(n<m) {
			for (int i =n; i>=1; i--) {
				
				if(m%i==0 && n%i==0) {
					return i;
				}
				
			}
		}
		
		
		
		
	    return n;

	}
}
package HomeWork;

import java.util.Scanner;

public class HomeWork093_Prefix_Again {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int n = scan.nextInt();
	    int count =0;
	    
	   // if(str.length()==1)
		   // System.out.println(false);
		    
		    
		    for (int i = 0; i <= str.length()-n; i=i+1) {
		    	
		    	if(str.substring(i, i+n).contentEquals(str.substring(0, n)))
		    		count++;
				
			}
		    
		    
		    
		    if(count>=n && str.length()>1){
	    		System.out.println(true);
	    	}
			else System.out.println(false);
		  
		  }
		}
			
		
	
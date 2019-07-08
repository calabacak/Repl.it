package HomeWork;

import java.util.ArrayList;

public class HomeWork_237_Common_Divisor {
	public static void main(String[] args) {
		System.out.println(commonDivisor(60,80));
		
	}
	
	public static int commonDivisor(int m, int n){
	    //WRITE YOUR CODE HERE
	    ArrayList <Integer> list= new ArrayList<>();
	    
	    int res=1;
	    
	    if(m<n) {
	    	for (int i =1; i<=m; i++){
		        if(m%i==0  && n%i==0){
		          list.add(m/i);
		        }
		      }
		      
		      for(int i=0; i< list.size(); i++){
		        res=res*list.get(i);
		      }
		      return res;
	    	
	    }else if(n<m) {
	    	for (int i =1; i<=n; i++){
		        if(m%i==0  && n%i==0){
		        	 list.add(n/i);
		        }
		      }
		      
		      for(int i=0; i< list.size(); i++){
		        res=res*list.get(i);
		      }
		      return res;
	  }
    	
	    for (int i =1; i<=n; i++){
	        if(m%i==0  && n%i==0){
	        	 list.add(n/i);
	        }
	      }
	      
	      for(int i=0; i< list.size(); i++){
	        res=res*list.get(i);
	      }
	      return res;

	}
}
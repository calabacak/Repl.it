package HomeWork;

import java.util.ArrayList;

public class HomeWork_213_Methods_with_ArrayLists_13 {
	
	public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) 
	  {
	    int sum=0;
	    for(int i=0; i< deliveries.size();i++) {
	    	sum+=deliveries.get(i);
	    }
	    if(sum%max_fuel==0) {
	    	return sum/max_fuel;
	    }else {
	    	return sum/max_fuel+1;
	    }
	  }

}

package HomeWork;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HomeWork_181_Methods_with_ArrayList_3_combine_arrays {
	public static void main(String[] args) {
		
		String [] a = {"f","o","o"};
		String [] b = {" b","a","r"};
		
		System.out.println(combineRs(a,b));
	}

	  public static String combineRs(String[] r1,String[] r2) 
	  {
		  ArrayList <String> list = new ArrayList<>();
		  
		
		  for(String s:r1) {
			  list.add(s);
		  }
	  
		  for(String s: r2) {
			  list.add(s);
		  }
		  String result="";
		  for(String s: list) {
			  result+=s;
		  }
	   return result;


	  }
	  
	  
	}

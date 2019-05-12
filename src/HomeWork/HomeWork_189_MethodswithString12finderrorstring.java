package HomeWork;

public class HomeWork_189_MethodswithString12finderrorstring {
	  public static boolean isError(String line) 
	  {
		  
		  
		  if( line.split(" ")[0].contentEquals("error")) {
			  return true;
		  }
	    return false;
	  }
	

}

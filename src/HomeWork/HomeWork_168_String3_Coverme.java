package HomeWork;

public class HomeWork_168_String3_Coverme {

	public static void main(String[] args) {
	    System.out.println(coverString("java methods", "me") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
		  
		  if(!main.contains(coverME)) {
			  return "["+main+"]";
		  }else {
			  
			  return main.replace(coverME, "["+coverME+"]");
		  }
	  }
	  
	}

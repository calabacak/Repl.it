package day13;

public class moreTernary {
public static void main(String[] args) {
	
	String quality = "good";
	int rating = (quality.contentEquals("good"))	?	100:0;
	
	System.out.println("rating is : " + rating);
	
	
	int PmHour = 6;
	boolean rushHour;
	
	  rushHour      = (PmHour>=4 && PmHour<=7)	? true :false;
	  
	  System.out.println(rushHour);
	  
	  String result = (rushHour) ?	"Yes" : "No";
	  System.out.println(result);
	  
	  int sPmHour = 8;
		String srushHour;
		
		  srushHour      = (sPmHour>=6 && sPmHour<=9)	? "yes" :"no";
		  
		  System.out.println(srushHour);
	  
	  
	  
	  
	
}
}

package OCA_Quizes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class oca6 {
	
	public static void main(String[] args) {
		
//		Boolean [] bool1= new Boolean[2];
//		
//		bool1[1]= new Boolean(null);
//		Integer  a=0;
//		bool1[1]= new Boolean(0);
//		
//		System.out.println(bool1[1]);
		
		
		LocalDateTime dt= LocalDateTime.of(2014, 7,31,1,1);
		dt.plusDays(30);
		dt.plusMonths(1);
		
		System.out.println(dt.format (DateTimeFormatter.ISO_DATE_TIME));
		System.out.println("Result A" + (0+1));
		
	}

}

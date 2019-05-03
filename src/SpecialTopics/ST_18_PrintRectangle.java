package SpecialTopics;

public class ST_18_PrintRectangle {
	public static void main(String[] args) {
		printHollowRect();
		
	}
	
	
	
	
	  public static void printHollowRect(){
		  
		  for (int i = 1; i <=25; i++) {
				for(int j= 1; j<=15; j++) {
					if (i == 1 || i == 25 ||  
			                j == 1 || j == 15)          
			                System.out.print("*");            
			            else
			            	System.out.print(" "); 
				}
				System.out.println(); 
	  }

	  
}

}
	
	
	
	
	
	



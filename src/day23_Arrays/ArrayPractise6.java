package day23_Arrays;

public class ArrayPractise6 {
	public static void main(String[] args) {
		
		int [][] scores = new int[8][8];
		
		for(int i = 0; i < 8; i++)
		   {
		      for(int j = 0; j < 8; j++)
		      {
		    	 scores[i][j]=j+8*i+1;
		    	  System.out.printf("%5d ", scores[i][j]);
		      }
		      System.out.println();
		   }
		
		
		
		
		
		
		
	}

}

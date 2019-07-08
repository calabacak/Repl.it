package HomeWork;

public class HomeWork_236_Methods_with_Arrays_6_tic_tac_toe {

	public static void main(String[] args) {
	    char[] game1 = {
	      'X', 'X', 'X',
	      '4', 'O', '6',
	      '7', 'O', 'O'
	    };
	     char[] game2 = {
	      'X', 'O', 'X',
	      '4', 'O', 'X',
	      '7', 'O', 'O'
	    };
	    
	    char[] game3 = {
	      '1', 'O', 'X',
	      '4', 'O', 'X',
	      '7', '8', 'X'
	    };
	    
	    System.out.println(won(game1)); //Player X won
	    System.out.println(won(game2)); //Player O won
	    System.out.println(won(game3)); //Player X won
	  }
	  
	  public static String won(char[] x){
		  
		 double size=  Math.sqrt(x.length);
		 
		 for(int i= 0; i<size-1; i++) {
			 if(x[i]==x[i+1]) {
				 if(x[i]=='X') {
					 return "Player X won";
				 }
			 }
			 
			 
			 
		 }
		  
		  
		  
		  
	   
	    return null;
	  }
	  
	  
	}

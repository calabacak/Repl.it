package HomeWork;

public class HomeWork_214_Methods_with_2DArrays_1_currency_conversion {
	public static void main(String[] args) {
		int [][] money = {{1,2,3,4},{2,4,6,8}};		
		System.out.println(money.length);
		
		
	}
	
	 public static  double convertC(String[][] money,String[][] convertionRate) 
	  {
	    double sum=0;
	    for(int i=0; i<money.length; i++) {
	    	
	    sum+=Double.parseDouble(money[i][1])*Double.parseDouble(convertionRate[i][1]);
	    	
	    }
	  return sum;
	  }

}

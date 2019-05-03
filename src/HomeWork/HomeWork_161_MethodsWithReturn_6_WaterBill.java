package HomeWork;

public class HomeWork_161_MethodsWithReturn_6_WaterBill {
	public static void main(String[] args) {
		
		System.out.println(waterTax(101));
		
		
//		double a= 5.90;
//		double b= a*0.60;
//		System.out.println(b);
		
	}
	public static double waterTax(double units)
	  {
		double bill = 0;
	    
	    //your code here
	    if(units<=50){
	      bill=units*0.60;
	      //return bill;
	    }else if(units>50 && units<=100){
	      bill=units*0.90;
	      //return bill;
	    }else if(units>100 && units<=150){
	      bill=units*0.90+50;
	      //return bill;
	    }else{
	      bill= units*0.90+100;
	      //return bill;
	    }
	    
	    //end your code here
	    
	    return bill;
	  }//end waterTax

	
}

package HomeWork;
//203. OOP 7 - carpet class
public class Carpet {
	 
	 //do not change -- Start
	  public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;
	 //do not change -- End
	 
	 //Add constructors below
	  
	  /*
	   * 1) No-Args constructor
  -sets default values for the Carpet object
   Size is 300 x 300 and totalPrice for that is 200. 
   And also it is not a Persian carpet. unitPrice is set as 0.
	   */
	  
	  
	  public Carpet() {
		   this.width=300;
		  this.length=300;
		  this.totalPrice=200;
		  this.unitPrice=0;
		  this.isPersian=false;
		  
	  }
	  
	  /*2) 4-Args  Constructor:
- accepts width, length, unitPrice, isPersian  parameters and assigns 
values to public instance variables. try to use this. keyword
	   * 
	   */
	  
	  public Carpet(double width,double length,double unitPrice,boolean isPersian) {
		  this.width=width;
		  this.length=length;
		  this.unitPrice=unitPrice;
		  this.isPersian=isPersian;
		  
		  /*
		   * Set totalPrice as the width + length multiplied by the unitPrice.
		   * if its a Persian carpet add 200 to totalPrice.
		   */
		  
		  
		  if(isPersian==true) {
			  totalPrice= (width + length)*unitPrice+200; 
		  }
		  else{
			  totalPrice= (width + length)*unitPrice;
		  }
		  
		  
		  
	  }
	  
	  
	}

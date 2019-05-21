package HomeWork;

public class HomeWork_197_OOP_4_calc_2 {
	
	/*
	 * Instance Methods:
   - getResult() - getter method for private result
   - setY(int y) - setter method for private y
   - setX(int x) - setter method for private x
 -  void plus() - adds x and y (x+y) values and assigns to result 
   - void minus() - subtracts x and y(x-y) values and assigns to result 
	 */
	
	private int x;
	private int y;
	private int result;
	
	public int getResult() {
		return result;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public void plus() {
		result=x+y;
	}
	public void minus() {
		result=x-y;
	}
	

}

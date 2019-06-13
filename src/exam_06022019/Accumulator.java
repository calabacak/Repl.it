package exam_06022019;

public class Accumulator {
	
	//An instance variable named sum of type integer.
	
	int sum;
	
	public Accumulator(int sum) {
		this.sum=sum;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void add(int a) {
		sum+=a;
	}
	
	public void remove(int a) {
		sum-=a;
	}
	/*
	 * The value of sum is increased by the value of the parameter.
A method named remove that accepts an integer parameter.
The value of sum is decreased by the value of the parameter.
	 */
public String toString() {
	//return "\'Sum is:"+ sum+"\'";
	return "Sum is:"+ sum;
}
	
	

}

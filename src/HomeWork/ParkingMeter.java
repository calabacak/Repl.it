package HomeWork;

public class ParkingMeter {
	/*
	 * Two instance variables named timeLeft and maxTime of type int. 
	 * The value of timeLeft should be initialized to 0.
	 */

	int timeLeft=0;
	int maxTime;
	
	/*
	 * A constructor accepting a single integer parameter 
	 * whose value is used to initialize the maxTime instance variable.
	 */
	public ParkingMeter(int maxTime) {
		this.maxTime=maxTime;
	}
	
	/*
	 * A method named add that accepts an integer parameter. 
	 * If the value of the parameter is equal to 25, the value of timeLeft is increased by 30; 
	 * otherwise no increase is performed. Furthermore, the increase occurs
	 *  only if the value of timeLeft will not exceed the value of maxTime. 
	 * add returns a boolean value: true if timeLeft was increase, false otherwise.
	 */
	
	public boolean add(int num) {
		if(num==25 && timeLeft+30<=maxTime) {
			timeLeft+=30;
			return true;
		}
		timeLeft=timeLeft;
		return false;
	}
	/*
	 * A method named tick that accepts no parameters and returns no value. 
	 * tick decreases the value of timeLeft by 1, but only if the value of timeLeft is greater than 0.
	 */
	
	
	public void tick() {
		if(timeLeft>0) {
			timeLeft--;
		}
		timeLeft=timeLeft;
	}
	
	/*
	 * A method named isExpired that accepts no parameters. 
	 * isExpired returns a boolean value: true if the value of timeLeft is equal to 0; false otherwise.

	 */
	
	public boolean isExpired() {
		if(timeLeft==0) {
			return true;
		}
		return false;
	}
	
	
}

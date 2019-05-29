package HomeWork;

public class Value {

	 int num;
	/*
	 * a constructor accepting a single integer parameter
	 */

	public Value(int num) {
		this.num = num;

	}

	/*
	 * a constructor with no parameters
	 */

	public Value() {

	}

	/*
	 * a method 'setVal' that accepts a single parameter,
	 */

	public void setVal(int num) {
		this.num = num+1;
		
	}

	/*
	 * a boolean method, 'wasModified' that returns true if setVal was ever called
	 * for the object.
	 */

	public boolean wasModified() {
		if(this.num==num+1) {
			return true;
		}
		return false;
	}
	/*
	 * a method 'getVal' that returns an integer value as follows: if setVal has
	 * ever been called, it getVal returns the last value passed to setVal.
	 * Otherwise if the "single int parameter" constructor was used to create the
	 * object, getVal returns the value passed to that constructor. Otherwise getVal
	 * returns 0.
	 */

	public int getVal() {
		if(wasModified()) {
			return num-1;
		}
		return num;
	}

}

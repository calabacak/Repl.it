package HomeWork;

public class Value2 {

	//WRITE YOUR CODE HERE
	   int num1;
	   int num2;
	   public static int x;
		/*
		 * a constructor accepting a single integer parameter
		 */

		public Value2(int num1) {
			this.num1 = num1;
			this.num2 = num1;

		}

		/*
		 * a constructor with no parameters
		 */

		public Value2() {
		  this.num1 = num1*num2;
			this.num2 = num1*num2;

		}

		/*
		 * a method 'setVal' that accepts a single parameter,
		 */

		public void setVal(int num2) {
			this.num2 = num2;
			this.num1 = num2;
			x++;
			
		}

		/*
		 * a boolean method, 'wasModified' that returns true if setVal was ever called
		 * for the object.
		 */

		public boolean wasModified() {
			if(this.num2==num2 && this.num1==num2&& x>0) {
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
			if(this.num2==num2 && this.num1==num2&& x>0) {
				return num2;
			}else if(this.num1==num1 && this.num2==num1){
			  return num1;
			}
			return 0;
		}

	}

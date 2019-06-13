package day57_interfaces;

	public class BMWi8 implements Electric{
		public void charge() {
			System.out.println("BMWi8 is charging at home");
		}
	}

	// Automonous>Electric : interface
	// Vehicle parent class
	// Tesla inherits from Vehicle and implements Automonous>Electric 
	// BMWi8 implements Electric 
package day57_interfaces;

public class Tesla extends Vehicle implements Electric, Automonous {
	public void charge() {
		System.out.println("Tesla is charging at charging station.");
	}

	public void selfDrive() {
		System.out.println("Tesla is in auto pilot mode. Driving autonomously");
	}
	
	
//	public void drive() {
//		System.out.println("Tesla/from Vehicle is driving");
//	}
}


 
//Automonous>Electric : interface
//Vehicle parent class
//Tesla inherits from Vehicle and implements Automonous>Electric 
//BMWi8 implements Electric 
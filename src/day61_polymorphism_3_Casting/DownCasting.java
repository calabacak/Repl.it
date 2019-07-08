package day61_polymorphism_3_Casting;

import day60_polymorphism_2.*;

public class DownCasting {
	public static void main(String[] args) {
		
		AppleDevice appDev= new IPad();
		appDev.use();
		
		IPad ipad2= (IPad) appDev;
		ipad2.draw();
	// Method buildAppleDevice, return type: AppleDevice
		
	}

}

package day49_inheritance_02_2;

import day49_inheritance_02.Device;

public class IPad extends Device {
	
	public void readEbook(String title) {
		
		System.out.println("Reading a book "+ title+ " using "+ brand + "tablet");
	}

}

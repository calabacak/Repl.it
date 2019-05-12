package day41_customClasseses02;

public class Microwave {
	String brand;
	boolean isOn;
	
	public  void turnOn() {
		if(isOn==true) {
			System.out.println(brand +" is already ON");
		}else {
			System.out.println("Turning ON "+ brand + " microwave");
			isOn=true;
		}
		
	}

	public  void turnOff() {
		if(isOn==false) {
			System.out.println(brand+ " is already OFF");
		}else {
			System.out.println("Turning OFF "+ brand + " microwave");
			isOn=false;
		}
		
	}
	
	public void heat(String food) {
		if(isOn) {
			System.out.println(brand+ " is heating "+ food);
		}
		
		
	}
}

package HomeWork;
//202. OOP 6 - TV 1

public class TV {
	/*
	 * Write a custom class TV that has 4 instance variables: int channel=1, int
	 * volumeLevel=1, boolean on = false, String brand = "undefined".
	 */

	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	String brand = "undefined";

	/*
	 * Create one "no arguments" constructor that prints message:
	 * "Creating TV object using no Args- constructor".
	 */

	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	/*
	 * Also, create one more constructor that defines instance variable brand, and
	 * displays message:"Creating TV object using 1 arg - constructor".
	 */

	public TV(String brand) {
		System.out.println("Creating TV object using 1 arg - constructor");
		this.brand = brand;
	}
	/*
	 * Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel),
	 * channel (getChannel/setChannel) and brand (getBrand/setBrand) instance
	 * variables.
	 */

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {

		/*
		 * Value of channel variable cannot be negative or zero, and cannot be higher
		 * than 120. If user will try to set invalid channel, display message:
		 * "ERROR: TV is either OFF or invalid Channel".
		 */
		if (channel <= 0 || channel > 120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		} else if(isOn()==true) {
			this.channel = channel;
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		/*
		 * Volume can be only in the range between 1 and 7. You may change volume only
		 * if TV is on. Otherwise, display message:
		 * "ERROR: TV is either OFF or invalid Volume level". 
		 * Create isOn() method that will check tv status.
		 */

		if (volumeLevel >= 1 && volumeLevel <= 7 && isOn()==true) {
			this.volumeLevel = volumeLevel;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	/*
	 * Declare methods channelUp() to increase variable channel by one, and
	 * channelDown() to decrease variable channel by one.
	 */

	public void channelUp() {
		setChannel(getChannel() + 1);

	}

	public void channelDown() {
		setChannel(getChannel() - 1);
	}

	/*Declare methods volumeUp() to increase variable volume by one, 
	 * and volumeDown() to decrease variable volume by one.
	 */
	
	
	public void volumelUp() {
		setVolumeLevel(getVolumeLevel() + 1);

	}

	public void volumeDown() {
		setVolumeLevel(getVolumeLevel() - 1);
	}

	/*
	 * Create isOn(), turnOn() and turnOff() methods for "on" instance variable. If
	 * tv is already on, no need to turn it on again, display message:
	 * "TV is already ON". If tv is already off, then no need to turn it off again,
	 * display message: "TV is already OFF".
	 */

	public boolean isOn() {
		return on;
	}

	public void turnOn() {
		if (isOn() == true) {
			System.out.println("TV is already ON");
		} else {
			on = true;
		}
	}

	public void turnOff() {
		if (isOn() == false) {
			System.out.println("TV is already OFF");
		} else {
			on = false;
		}
	}

}

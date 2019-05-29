package day51_inheritance_04;

public class Snowboarding extends Exercise{
	
	public int perform(int minutes) {
		int cals = super.perform(10);//call super class version of perform
		System.out.println("Snowboarding for " + minutes + " minutes");
		return minutes * 7 + cals;
	}
	
}
package day51_inheritance_04;

public class Running extends Exercise{
	int cal=10;
	
	@Override
	public int perform(int minutes) {
		System.out.print("Running ");
		return minutes*cal;
	}

}

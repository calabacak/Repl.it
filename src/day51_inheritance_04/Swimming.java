package day51_inheritance_04;

public class Swimming extends Exercise{
	int cal=11;
	public int perform(int minutes) {
		System.out.print("Swimming ");
		return minutes*cal;
	}

}

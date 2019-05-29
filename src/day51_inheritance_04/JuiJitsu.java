package day51_inheritance_04;

public class JuiJitsu extends Exercise{
	int cal=12;
	
		public int perform(int minutes) {
		System.out.print("Doing JuiJitsu ");
		return minutes*cal;
	}

}

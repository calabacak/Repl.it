package day51_inheritance_04;

public class Yoga extends Exercise{
	int cal=5;
			
		public int perform(int minutes) {
		System.out.print("Doing Yoga ");
		return minutes*cal;
	};

}

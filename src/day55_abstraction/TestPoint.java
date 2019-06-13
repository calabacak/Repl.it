package day55_abstraction;

public class TestPoint {
	public static void main(String[] args) {
		
		int i1=5;
		int i2=5;
		
	Point p1= new Point(2,2);
	Point p2= new Point(2,2);
	Point p3= new Point(2,3);
	
	
	System.out.println(i1==i2);
	System.out.println(p1==p3);
	System.out.println(p1==p2);
	System.out.println(p1.equals(p2));
		
	}

}

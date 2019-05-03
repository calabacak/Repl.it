package day10;

public class Area_Calculator {
	public static void main(String[] args) {
		area(-4);
		area(5,4);
	
	}
	public static double area(double radius){
		if (radius>0) {
		double area = Math.PI*(Math.sqrt(radius/2));
		System.out.println("if radius is " + radius + " the area is " + area);
		return area;}
		else  {
		System.out.println("invalid data");
		return -1;
	}
	}
	public static double area(double shortSide, double longSide){
		double arearectangle = shortSide*longSide;
		System.out.println("if demensions are " + shortSide + " and " + longSide + "the area is "+ arearectangle);
		return arearectangle;
		}
		
	
	

}

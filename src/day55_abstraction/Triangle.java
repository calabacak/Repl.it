package day55_abstraction;

public class Triangle extends Shape{
	
	double length1;
	double length2;
	double length3;
	

	public Triangle() {
		super("Triangle");
	}
	
	public Triangle(double lenght1, double length2, double length3) {
		super("Triangle");
		this.length1=length1;
		this.length2=length2;
		this.length3=length3;
	}

	@Override
	public double calculateArea() {
		double p = (length1 + length2 + length3)/2;
		 area= Math.sqrt(p*(p-length1)*(p-length2)*(p-length3));
		 return area;
	}

	@Override
	public void draw() {
		System.out.println("     *  \n" + 
				"    ***\n" + 
				"   *****\n" + 
				"  *******\n" + 
				" *********");
	}

}

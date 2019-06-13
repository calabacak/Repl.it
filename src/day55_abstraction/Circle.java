package day55_abstraction;

public class Circle extends Shape {

	/*
	 * 5.1,create no arg constructor and call super class's one arg constructor for
	 * Circle
	 */

	double radius;

	public Circle() {
		super("Circle");
	}

	public Circle(String name) {
		super("Circle");
	}

	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	@Override
	public double calculateArea() {

		return Math.PI*Math.pow(radius,2);

	}

	@Override
	public void draw() {
		System.out.println("  ***  \n" + 
				" *   * \n" + 
				"*     *\n" + 
				"*     *\n" + 
				"*     *\n" + 
				" *   * \n" + 
				"  ***");
	}

}

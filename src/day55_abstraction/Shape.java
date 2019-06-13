package day55_abstraction;

public abstract class Shape {
	
	//2,create instance fields: name, area (double);
	
	String name;
	double area;
	/*
	 * 3,create 2 abstract method as below :
calculateArea() return double, no arg
draw() void 
	 */
	
	public abstract double calculateArea();
	
	public abstract void draw();
	
	//4,create one constructor that set name-value
	
	public Shape(String name) {
		this.name=name;
	}
	
}

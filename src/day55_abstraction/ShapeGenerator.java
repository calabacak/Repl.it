package day55_abstraction;

public class ShapeGenerator {
public static void main(String[] args) {
	
	Circle circle1= new Circle(10);
	Triangle triangle1= new Triangle(4,4,4);
	
	System.out.println(circle1.calculateArea());
	circle1.draw();
	System.out.println("====================");
	
	System.out.println(triangle1.calculateArea());
	triangle1.draw();

}
}

package day60_polymorphism_2;

import day59_polymorphism.Circle;
import day59_polymorphism.Shape;
import day59_polymorphism.Square;
import day59_polymorphism.Triangle;

public class InstanceOf {
	public static void main(String[] args) {

		Shape shape = new Circle();

		// getClass().getName()
		System.out.println(shape.getClass());
		System.out.println(shape.getClass().getName());
		System.out.println(shape.getClass().getSimpleName());

		if (shape.getClass().getSimpleName().equals("Triangle")) {
			System.out.println("it is a triangle");
		} else if (shape.getClass().getSimpleName().equals("Circle")) {
			System.out.println("it is a circle");
		} else if (shape.getClass().getSimpleName().equals("Square")) {
			System.out.println("it is a square");
		}

		if (shape instanceof Circle) {
			System.out.println("it is a circle");
		} else if (shape instanceof Square) {
			System.out.println("it is a square");
		} else if (shape instanceof Triangle) {
			System.out.println("it is a triangle");
		}

		System.out.println(shape instanceof Shape);

		Shape[] shapes = { new Triangle(), new Square(), new Circle(), new Triangle(), new Square(), new Circle() };

		int sumCircle = 0;
		int sumSquare = 0;
		int sumTriangle = 0;

		for (Shape s : shapes) {
			if (s instanceof Triangle) {
				sumTriangle++;
			} else if (s instanceof Circle) {
				sumCircle++;
			} else if (s instanceof Square) {
				sumSquare++;
			}
		}
		System.out.println("Number Of Triangle: "+sumTriangle+" Number Of Circle: "+sumCircle+" Number Of Square "+sumSquare);

	}

}

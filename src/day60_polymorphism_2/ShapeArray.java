package day60_polymorphism_2;

import day59_polymorphism.Circle;
import day59_polymorphism.Shape;
import day59_polymorphism.Square;
import day59_polymorphism.Triangle;
import java.util.*;

public class ShapeArray {
	public static void main(String[] args) {
		
		Shape shape = new Triangle();//polymorphic array :)
		shape.draw();// overriden method in Triangle is invoked;
		Shape[] shapes = {new Triangle(), new Square(), new Circle(),
						  new Triangle(), new Square(), new Circle()};
		
		Shape[] shapes2= new Shape[3];
		shapes[0]=new Triangle();
		shapes[1]=new Square();
		shapes[2]=new Circle();
		
		
		for(Shape s:shapes) {
			System.out.println(s.getClass().getName());//getSimpleName
			s.draw();
		}
		
		List<Shape> list1= new ArrayList<>();
		list1.add(new Triangle());
		list1.add(new Circle());
		list1.add(new Square());
		System.out.println("====ArraylList===");
		list1.get(0).draw();
		
		for(Shape s: list1) {
			System.out.println(s.getClass().getSimpleName().toUpperCase());
			s.draw();
		}
		
	
		
		
		
		
		
	}

}

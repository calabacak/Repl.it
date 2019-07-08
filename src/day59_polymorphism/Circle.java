package day59_polymorphism;

public class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("    * * *    \n" +
			               " *         * \n" +
			               "*           *\n" +
			               "*           *\n" +
			               "*           *\n" +
			               " *         * \n" +
			               "    * * *  ");
	}
}

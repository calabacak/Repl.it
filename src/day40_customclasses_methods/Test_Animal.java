package day40_customclasses_methods;

public class Test_Animal {
	public static void main(String[] args) {

		//Animal an = new Animal("lion", 36, "brown");
		Animal an = new Animal();

		an.setColor("brown");
		an.setAge(36);
		an.setName("lion");

		System.out.println(an.getColor());
		
		

	}

}

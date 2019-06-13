package MyMentoring;

public class Test {
	public static void main(String[] args) {
		
		Car car1=new Car("Volkswagen","Golf","Red",2);
		System.out.println(car1.toString());
		
		Car car2= new Car("Toyota","Corolla","White",4);
		System.out.println(car2.toString());
		
		Car car3= new Car("BMW",2);
		System.out.println(car3.toString());
		
		///all problems are fixed? dont think so?
		
		Car car4= new Car("BMW","X5","Orange",8);
		System.out.println(car4.toString());
		
		car4.brand="qwert";
		System.out.println(car4.toString());
		
		
		
	}

}

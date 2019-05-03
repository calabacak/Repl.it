package OPPsCengiz;

public class Test {
	public static void main(String[] args) {
		
		food [] meal = new food[3];

		meal [0]= new Fish();
		meal [1]= new Steak();
		meal [2]= new Pizza();
		
		
		for(int i=0; i<3; i++) {
			
			meal[i].eat();
		}
		
	}

}

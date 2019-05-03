package HomeWork;

public class HomeWork_116_UtopianTree {
	public static void main(String[] args) {
		
		for(int i = 1; i<=3; i++) {
			
			System.out.println("year "+i+ " - "+ "growth " + "1 cm");
			System.out.println("tree size: "+i+"cm");
		}
		
		for(int i = 1; i<=7; i++) {
			
			System.out.println("year "+(i+3)+ " - "+ "growth 2 cm");
			System.out.println("tree size: "+(3+2*(i))+"cm");
		}
		
		
	}

}



//The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year, this is a simple implementation of the algorithm. You will need to use loops to create it.
//Show 10 years of growth of the Utopian Tree.
//
//Output:
//year 1 - growth 1 cm
//tree size: 1cm
//year 2 - growth 1 cm
//tree size: 2cm
//year 3  - growth 1 cm
//tree size:3cm
//year 4 - growth 2 cm
//tree size: 5cm
//year 5 - growth 2 cm
//tree size: 7cm
//year 6 - growth 2 cm
//tree size: 9cm
//... until you reach year 10
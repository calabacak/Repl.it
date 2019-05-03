package HomeWork;

import java.util.Scanner;

public class HomeWork_119_Arrays_Average_temperature {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
  	
		
		for(int i=0; i<temps.length; i++) {
			
			total+= temps[i];
		}
		
		System.out.println(total/temps.length);
		
		
		//80 88 88 84 82 78 60 68
		
		
		
	}

}

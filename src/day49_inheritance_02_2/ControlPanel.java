package day49_inheritance_02_2;

import java.util.Scanner;

/*
 * ###Create a class ControlPanel with  a main method to test your class with at least three hot dog stands that each sell a variety of HotDogs. 

- Main method should asks user to enter command. 
- A command can be "sold", which in result would ask for cart number and increment its pointer. 
- Another command can be "print", which will also asks for cart number and print how many hotdogs that cart sold. 
- One command would be "print-all", that will result in printing how many HotDogs were sold by all carts. 
- Call Static method of HotDogStand for "print-all". Lastly, anything else will terminate the program.
 */
public class ControlPanel {
	public static void main(String[] args) {
		// this is our network of our hotdog stands
		int cartNumber;
		String command;

		HotDogStand[] stands = new HotDogStand[3];
//		HotDogStand stand1= new HotDogStand(0,0);
//		stands[0]= stand1;
		stands[0] = new HotDogStand(0, 0);
		stands[1] = new HotDogStand(1, 0);
		stands[2] = new HotDogStand(2, 0);

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("enter command: ");

			command = scan.next();

			if (command.equals("sold")) {
				System.out.println("enter cart number: ");
				cartNumber = scan.nextInt();
				stands[cartNumber].justSold();
			} else if (command.equals("print")) {
				// Another command can be "print", which will also asks for cart number and
				// print how many hotdogs that cart sold.
				System.out.println("enter cart number: ");
				cartNumber = scan.nextInt();
				System.out.println(stands[cartNumber].getSold());
				;
			} else if (command.equals("print-all")) {
				System.out.println("Total sold: " + HotDogStand.getTotal());
			} else {
				return;
			}

		}
	}
}

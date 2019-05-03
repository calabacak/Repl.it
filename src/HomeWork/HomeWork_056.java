package HomeWork;

import java.util.Scanner;

public class HomeWork_056 {
	  public static void main(String[] args) {
		    double price = 0;
		    double screenSize;
			String storageType, screenResolution;
			int ram = 0 ;
			int memorySize;
			String cpu;
			Scanner scan = new Scanner(System.in);
		  
				System.out.println("Select screen size:");
				screenSize = scan.nextDouble();
				if(screenSize==13.3) { price = price + 200;}
				else if(screenSize==15.0) { price = price + 300;}
				else if(screenSize==17.3) { price = price + 400;}
					
				System.out.println("Select CPU type:");
				cpu = scan.next();
				if(cpu.contentEquals("i3")) { price = price + 150;}
				else if(cpu.contentEquals("i5")) { price = price + 250;}
				else if(cpu.contentEquals("i7")) { price = price + 350;}
				
				System.out.println("Select RAM size:");
				ram = scan.nextInt();
				price = price + ram*50/4;
				
				System.out.println("Select storage type:");
				storageType = scan.next();
				
				System.out.println("Enter memory size:");
				memorySize = scan.nextInt();
				if (storageType.contentEquals("HDD")) {price = price + memorySize*50/500;}
				else if (storageType.contentEquals("SSD")) {price = price + memorySize*100/500;}
				
				System.out.println("Enter screen resolution:");
				screenResolution = scan.next();
				if(screenResolution.contentEquals("FULLHD")) { price = price + 100;}
				else if(screenResolution.contentEquals("4K")) { price = price + 200;}
				
				System.out.println("Laptop price is: $"+price);
				
				
		  }
		}

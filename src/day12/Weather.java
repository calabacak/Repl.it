package day12;

import java.util.Scanner;

public class Weather {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How is the weather today?");
		String weather = scan.nextLine().toUpperCase();
		
		switch(weather) {
			case "sunny": System.out.println("Go to Park");break;
			case "hot": System.out.println("Go Swimming");break;
			case "rainy": System.out.println("Go shopping");break;
			case "snow": System.out.println("go skiing");break;
			default: System.out.println("Code Java in any other weather");
		
		}
		
	}

}

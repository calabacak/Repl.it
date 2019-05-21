package day43_Encapsulation_constructor;

public class SwitchPractise {
	public static void main(String[] args) {

		double price;
		String color = "black";

		switch (color) {
		case "red":
		case "yellow":
		case "green":
			price = 550;
			System.out.println(price+" | "+ color);
			break;

		case "white":
			price = 500;
			System.out.println(price+" | "+ color);
			break;

		case "brown":
			price = 400;
			System.out.println(price+" | "+ color);
			break;

		case "black":
			price = 450;
			System.out.println(price+" | "+ color);
			break;

		default:
			System.out.println("invalid color "+color);
			price = 0;
		}
	}

}

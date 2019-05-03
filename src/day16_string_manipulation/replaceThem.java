package day16_string_manipulation;

public class replaceThem {
	public static void main(String[] args) {

		String sentence = "Coding is fun, it is my hobby";

		String withNoSpace = sentence.replace(" ", "");

		System.out.println(withNoSpace);

		// replace , with !!!

		System.out.println(sentence.replace(",", "!!!"));

		String mixed = "@#$%j&a-va|&^%$#@";
		mixed = mixed.replace("@#$%", "");
		System.out.println(mixed);

		mixed = mixed.replace("|&^%$#@", "");
		System.out.println(mixed);
		mixed = mixed.replace("&", "").replace("-", "");

		System.out.println(mixed);

	}

}

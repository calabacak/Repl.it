package HomeWork;

public class CamelCase {

	public static void main(String[] args) {

		String str = "los angeles   ";

		System.out.println(camelCase(str));

	}

	public static String camelCase(String in) {
		String in1 = in.substring(0, 1).toUpperCase().trim() + in.substring(1).trim();
		String in2 = "";

		for (int i = 0; i < in1.length(); i++) {
			if (in1.charAt(i) == ' ' && i != in1.length() - 1) {
				in2 += in1.charAt(i);
				in2 += in1.substring(i + 1, i + 2).toUpperCase();
				i++;
			} else {
				in2 += in1.charAt(i);
			}
		}

		// TODO
		return in2;
		// return null;
	}

}

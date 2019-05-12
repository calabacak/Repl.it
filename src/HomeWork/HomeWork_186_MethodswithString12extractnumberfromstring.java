package HomeWork;

public class HomeWork_186_MethodswithString12extractnumberfromstring {
	public static void main(String[] args) {
		
		String s="aa2aa3";
		System.out.println(extractNum(s));

	}

	public static String extractNum(String s) {

		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				result += s.charAt(i);

			}
		}
		return result;

	}

}

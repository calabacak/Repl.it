package HomeWork;

public class HomeWork_167_Methods_with_String3 {

	public static void main(String[] args) {
		// test your code
		System.out.println(uniqueChars("mama"));
	}

	public static String uniqueChars(String str) {
		int count = 0;
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				res += str.charAt(i);
			} else {
				if(!res.contains(""+str.charAt(i)))
				res += str.charAt((i));
			}
		}
		return res;
	}

}

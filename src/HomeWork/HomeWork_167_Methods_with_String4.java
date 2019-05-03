package HomeWork;

public class HomeWork_167_Methods_with_String4 {

	public static void main(String[] args) {
		// test your code
		System.out.println(uniqueChars("java"));
	}

	public static String uniqueChars(String str) {
		int count = 0;
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
				res+=str.charAt(i);
			}
		}
		
		return res;
			
	}

}

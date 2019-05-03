package day24;

public class PractiseCharArray {
	public static void main(String[] args) {

		String str = "wooden spoon";

		char[] chars = str.toCharArray();

		for (char element : chars) {
			// System.out.print(element+" - ");
		}
		String charsreversed="";
		for(int i = chars.length-1; i>=0; i--) {
			charsreversed+=str.charAt(i);
		}
		System.out.println(charsreversed);
		char temp;
		for (int i = 0; i <= chars.length / 2; i++) {
			temp = chars[chars.length - 1 - i];
			chars[chars.length - i - 1] = chars[i];
			chars[i] = temp;
		}
		for (char els : chars) {

			System.out.println(els);
		}
	}

}

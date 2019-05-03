package day10;

public class deneme3 {
	public static void main(String[] args) {
		
		String str = "jsdgdbvaaannndfnkvifobfpptt";
		String unique = "";
		for (int i = 0; i< str.length();i++) {
			if (!unique.contains	(str.charAt(i) + ""))
			{unique += str.charAt(i);
			}
		}
		System.out.println(unique);
	}
}

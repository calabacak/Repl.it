package HomeWork;

public class CoverMe {
	public static void main(String[] args) {
		String a = "hello hello cengiz cehelloren";
		String b = "ello";
		//System.out.println(coverString(a, b));

	}

	public static String coverString(String main, String coverME) {

		int a = main.indexOf(coverME);

		if (a < 0) {
			return "[" + main + "]";
		} else {
			String result = main.replaceAll(coverME, "[" + coverME + "]");
			// String s=main.substring(0,
			// main.indexOf(coverME))+"["+coverME+"]"+main.substring(main.indexOf(coverME)+coverME.length());
			return result;
		}

	}

}

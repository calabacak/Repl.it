package HomeWork;

import java.util.*;

public class HomeWork_175_Methods_with_String_10 {

	public static String lameDb(String db, String op, String id, String data) {

		String[] str = db.split("#");

		ArrayList<String> result = new ArrayList<>();

		for (String s : str) {
			result.add(s);
		}

		if (op.contentEquals("add")) {
			result.add((result.size() + 1) + "" + data);
		} else if (op.contentEquals("edit")) {
			result.remove(Integer.parseInt(id) - 1);
			result.add(Integer.parseInt(id) - 1, Integer.parseInt(id) + "" + data);
		} else if (op.contentEquals("delete")) {
			result.remove(Integer.parseInt(id) - 1);
		}

		String str1 = "";
		for (int i = 0; i < result.size(); i++) {
			if (i == result.size() - 1) {
				str1 += result.get(i);
			} else {
				str1 += result.get(i) + "#";
			}
		}
		return str1;

	}// end lameDb

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}

}

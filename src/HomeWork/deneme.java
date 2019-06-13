package HomeWork;

import java.util.ArrayList;

public class deneme {
	public static void main(String[] args) {
		String [] str1= {"1","title1","content1"};
		String [] str2= {"2","title2","content2"};
		
		ArrayList <String[]> list1= new ArrayList<>();
		
		list1.add(str1);
		list1.add(str2);
		
		System.out.println(list1.get(1)[0]);
	}

}

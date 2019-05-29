package Most_Frequent_Coding_Questions;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		
		int a= 1;
		
		for(int i=a+1; i<=a+3; i++) {
			System.out.println(i);
		}
		

String str= "abcd";
System.out.println(str.substring(0, 2));
String word="ali veli";

String [] str1= word.split(" ");

System.out.println(str1.length);

String str2="";

for(int i=0; i<word.length(); i++) {
	if(!str2.contains(""+word.charAt(i))) {
		str2+=word.charAt(i);
	}
}

System.out.println(str2);


String [] str3= {"java", "code", "python", "code", "rust", "code", "rust"};

for(int i= 0; i<str3.length; i++) {
	//int count=0;
	for(int j=0; j<str3.length; j++) {
		if(str3[i].equals(str3[j])&& i==j) {
		
			System.out.println(str3[i]);		
		}
		
			
		
	}
	
	}
}
	

}


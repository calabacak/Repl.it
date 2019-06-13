package HomeWork;
import java.util.*;

public class HomeWork_231_MethodswithString17Reversevowels {
	public static void main(String[] args) {
		String str="hello world";
		
		System.out.println(reverseVowels(str));
		
	}
	
	  
	  public static String reverseVowels(String str) {
		  
		  ArrayList<String> list1= new ArrayList<>();
		  for(int i=0; i<str.length();i++) {
			  list1.add(""+str.charAt(i));
		  }
	   
		  ArrayList<String> vovels= new ArrayList<>();
		  vovels.add("a");
		  vovels.add("e");
		  vovels.add("i");
		  vovels.add("o");
		  vovels.add("u");
		  
		  ArrayList<String> list2= new ArrayList<>();
		  
		  for(int i=list1.size()-1; i>=0; i--) {
			  if(vovels.contains(list1.get(i))) {
				  list2.add(list1.get(i));
			  }
		  }
		  
		  for(int i=0; i<list1.size(); i++) {
			  if(!vovels.contains(list1.get(i))) {
				  list2.add(i, list1.get(i));
			  }
		  }
		  String result="";
		  
		  
		  for(int i=0; i<list2.size(); i++) {
			  result+=list2.get(i);
		  }
		  
		  return result;
		  
		  
		  
		  
		  
		  
		  
	  }

}

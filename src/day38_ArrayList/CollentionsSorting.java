package day38_ArrayList;
import java.util.*;

public class CollentionsSorting {
	public static void main(String[] args) {
		
	List<Integer> numsList = new ArrayList<>();
	
	numsList.add(44);
	numsList.add(14);
	numsList.add(54);
	numsList.add(24);
	
	System.out.println(numsList);
	Collections.sort(numsList);
	System.out.println(numsList);
	
	List<String> strList = new ArrayList<>();
	
	strList.add("Fuad");
	strList.add("Roman");
	strList.add("Murad");
	strList.add("Muhabbat");
	strList.add("Maria");
	strList.add("Dina");
	strList.add("Bojan");
	System.out.println(strList);
	Collections.sort(strList);
	System.out.println(strList);
	
	Collections.max(numsList);
	Collections.min(numsList);
	
	System.out.println("max="+Collections.max(numsList) );
	System.out.println("min="+Collections.min(numsList) );
	
	
	
	String maxName= Collections.max(strList);
	String minName= Collections.min(strList);
	System.out.println("the longest name "+maxName);
	System.out.println("the shortest name "+minName);
	
	Collections.shuffle(strList);
	System.out.println(strList);
	}
	




}

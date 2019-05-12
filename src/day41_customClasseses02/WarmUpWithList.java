package day41_customClasseses02;

import java.util.*;

public class WarmUpWithList {
	
	public static void main(String[] args) {
		List <Integer> List = new ArrayList<Integer>();
		
		List.add(3);
		List.add(5);
		List.add(7);
		
		System.out.println(doubleTheList(List));
		
		
	}
	
	
	public static List<Integer> doubleTheList(List <Integer> List){
		
		
		for(int i=0; i<List.size(); i++) {
			List.set(i, 2*List.get(i));
		}
		return List;
	}

}

package day45_encapsulation_practice;
import java.util.*;

public class ArrayListOfSuperHeros {
	public static void main(String[] args) {
		ArrayList<String> superheroes = new ArrayList<>();
		superheroes.add("Spiderman");
		// it takes 2 params
		// first is position, second is value to set
		// there is no 2 element, so we cannot set it.
		// superheroes.set(1, "Iron man");
		superheroes.add("Iron man");
		superheroes.add("Hulk");
		superheroes.add("Wonder Woman");
		superheroes.add("Thor");
		superheroes.add("Batman");
		superheroes.add("Hellboy");
		superheroes.add("Superman");
		superheroes.add("Flash");
		superheroes.add("Captain America");
		superheroes.add("Ant-Man");
		superheroes.add("Aquaman");
		System.out.println(superheroes);
		// let's create an array list that will store superheroes that have space in the
		// name
		
		ArrayList <String> superHerosWithSpace= new ArrayList<>();
		
		int k=0;
		
		for(String c:superheroes) {
			if(c.contains(" ")) {
				superHerosWithSpace.add(c);
			}
		}
		System.out.println(superHerosWithSpace.toString());
		
		// let's find the longest name
		
		int longest=0;
		String longestName="";
		
		for(String c: superheroes) {
			if(c.length()>longest) {
				longest=c.length();
				longestName=c;
				
			}
		}
		System.out.println(longestName);
		
		// let's find the second longest name
		
		int secondlongest= longest;
		String secondlongestName="";
		
		for(String c: superheroes) {
			if(longest-c.length()<secondlongest && !c.contentEquals(longestName)) {
				secondlongest=longest-c.length();
				secondlongestName=c;
				
			}
		}
		
		System.out.println(secondlongestName);
		
		int longestv2=0;
		String longestNamev2="";
		
		for(String c: superheroes) {
			if(c.length()>longestv2 && !c.contentEquals(longestName)) {
				longestv2=c.length();
				longestNamev2=c;
				
			}
		}
		System.out.println(longestNamev2);
		
		
		
		
}
}
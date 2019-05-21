package day45_encapsulation_practice;
import java.util.*;
public class AsArrayList {
	public static void main(String[] args) {
		
		String[] superheroes = { "Spiderman", "Iron man", "Hulk", "Wonder Woman", "Thor", "Batman", "Hellboy", "Superman",
                "Flash", "Captain America", "Ant-Man", "Aquaman" };
		
		System.out.println(Arrays.toString(superheroes));
		
		ArrayList<String> alist= new ArrayList<>(Arrays.asList(superheroes));
		
//	same	alist.addAll(Arrays.asList(superheroes));
		alist.add("cengiz");
		
		System.out.println(alist);
		
	}

}

package day42_customclasses_encapsulation;
import java.util.*;
public class Burger7 {
	public static void main(String[] args) {
		
		Burger burger1= new Burger();
		
		burger1.name="COWBOY";
		 String[] ings = {"onion crisps", "american cheese", 
                 "pickles", "lettuce", "b7 sauce"};
		 burger1.ingredients = ings;
		 
		 System.out.println(burger1.name);
		 System.out.println(Arrays.toString(burger1.ingredients));
		 System.out.println((burger1.ingredients[0]));
		 
		 for(String b: burger1.ingredients) {
			 System.out.println(b);
		 }
	}

}

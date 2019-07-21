package day65_Collections02;
import java.util.*;

public class TestMyExample3 {
	
	public static void main(String[] args) {
		
		
		Set<MyExample2> listOfBanana=new HashSet<>();
		
		
		
		MyExample2 banana1 = new MyExample2("export", 12.99);
		MyExample2 banana5 = new MyExample2("export", 12.99);
		MyExample2 banana6 = new MyExample2("export", 12.99);
		MyExample2 banana2 = new MyExample2("home", 22.99);
		MyExample2 banana3 = new MyExample2("export", 32.99);
		MyExample2 banana4 = new MyExample2("home", 42.99);

		
		listOfBanana.add(banana1);
		listOfBanana.add(banana2);
		listOfBanana.add(banana3);
		listOfBanana.add(banana4);
		listOfBanana.add(banana5);
		listOfBanana.add(banana6);
		
		
		
		
		System.out.println(listOfBanana.size());
		//System.out.println(listOfBanana.toString());
		
		listOfBanana.forEach(n->System.out.println(n));
		
		
		
		
		
		
		
	}

}

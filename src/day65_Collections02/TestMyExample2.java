package day65_Collections02;
import java.util.*;

public class TestMyExample2 {
	
	public static void main(String[] args) {
		
		
		List<MyExample1> listOfBanana=new ArrayList<>();
		
		
		
		MyExample1 banana1 = new MyExample1("export", 12.99);
		MyExample1 banana2 = new MyExample1("home", 22.99);
		MyExample1 banana3 = new MyExample1("export", 32.99);
		MyExample1 banana4 = new MyExample1("home", 42.99);
		MyExample1 banana5 = new MyExample1("export", 12.99);
		MyExample1 banana6 = new MyExample1("export", 12.99);
		
		listOfBanana.add(banana1);
		listOfBanana.add(banana2);
		listOfBanana.add(banana3);
		listOfBanana.add(banana4);
		listOfBanana.add(banana5);
		listOfBanana.add(banana6);
		
		
		
		
		System.out.println(listOfBanana.size());
		//System.out.println(listOfBanana.toString());
		
		listOfBanana.forEach(n->System.out.println(n));
		
		System.out.println("__________________");
		Collections.sort(listOfBanana);
		//System.out.println(listOfBanana.toString());
		listOfBanana.forEach(n->System.out.println(n));
		
		
		
		
		
	}

}

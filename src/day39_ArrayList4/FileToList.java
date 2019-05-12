package day39_ArrayList4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileToList {
	public static void main(String[] args) throws FileNotFoundException {
		//create object
		File file = new File("product.txt");
		//open file using scanner
		Scanner scan = new Scanner(file);
		List<String> list = new ArrayList<>();

		while (scan.hasNextLine()) {
			//System.out.println(scan.nextLine());
			//list.add(scan.nextLine());
			
			String line = scan.nextLine();
			System.out.println(line);
			list.add(line);
			
		}
		System.out.println(list);
	}

}

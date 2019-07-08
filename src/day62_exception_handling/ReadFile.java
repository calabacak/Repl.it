package day62_exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {//throws Throwable
		
		File file = new File("porducts.txt");	
		
		Scanner scanner=null;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

		}catch(Throwable t) {
			System.out.println("File Not Found");
			t.printStackTrace();
			
		}finally {
			scanner.close();
		}
		
	}

}

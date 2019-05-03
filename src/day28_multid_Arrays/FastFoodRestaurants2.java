package day28_multid_Arrays;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FastFoodRestaurants2 {
	public static void main(String[] args) throws IOException {

		// read all data assign the array;

		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);

//		System.out.println("Data size = "+ data.length);
//		System.out.println(data[0]);
//		System.out.println(data[1]);
//		System.out.println(data[data.length-1]);
		// System.out.println(Arrays.deepToString(data));
//		int counter=0;
//		for(String s: data) {
//			if(s.contains(",VA,")) {
//				counter++;
//			System.out.println(counter +"\t"+s);
//			}
//		}

		for (String s : data) {
			if (s.contains(",VA,")) {
				String[] resArr = s.split(",");
				System.out.println(resArr[1] + " - " + resArr[2]);
			}
		}
	}
}

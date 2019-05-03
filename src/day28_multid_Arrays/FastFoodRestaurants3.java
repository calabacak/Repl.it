package day28_multid_Arrays;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FastFoodRestaurants3 {
	public static void main(String[] args) throws IOException {

		// read all data assign the array;

		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);

		String[][] restArr = new String[data.length][];
		int ix = 0;
		for (String rests : data) {
			restArr[ix++] = rests.split(",");
		}
		
		
//		for(int i=0; i<restArr.length;i++) {
//			for(int j=0; j< 6; j++) {
//				System.out.println(restArr[i][j]);
//			}
//		}
		
		
		
		// restArr is accessible here
		 System.out.println(Arrays.deepToString(restArr));
	}
}

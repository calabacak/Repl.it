package day28_multid_Arrays;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FastFoodRestaurants1 {
	public static void main(String[] args) throws IOException {

		// read all data assign the array;

		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
//		int count = 1;
//		for (String rows : data) {
//			System.out.println(count + "\t" + rows);
//			count++;
//		}
//		String[] arrrdata= new String[data.length];
//		for (String rows : data) {
//			String[] arrdata = rows.split(",");
//			System.out.println(arrdata[1]);
		// }
		System.out.println(data[0]);
//		String [] str= data[0].split(",");
//		System.out.println(Arrays.toString(str));

		 //String [] arrdata = new String[data.length];
		for (int i = 0; i < data.length; i++) {
			String [] arrdata=data[i].split(",");
			
			System.out.println("name:"+arrdata[2]+" postalCode :"+arrdata[3]);
			
			
			//System.out.println(arrdata.length);
			}
		

//		 String [][] arrdata = new String[data.length][6];
//		for (int i = 0; i < data.length; i++) {
//			for(int j= 0; j<6;j++) {
//				arrdata[i][j]= data[i].split(",");
//			}
//
//			}
	
		
	//System.out.println(Arrays.toString(arrdata));
//		System.out.println(data[1]);
//		int count =0;
//		for(int i =0; i<data.length; i++) {
//			String[] arrdata= data[i].split(",");
//			if(arrdata[2].contentEquals("McDonald's")) {
//				System.out.println(arrdata[2]);
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		
		
		
	}
}

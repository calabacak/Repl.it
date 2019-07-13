package OCA_Quizes;
import java.util.*;

public class selfstudy1 {
	public static void main(String[] args) {
		
		int [] nums = {3,4,3,4,5,6,7,8,2,8,22};
		
		//System.out.println(findUniques(nums));
		drawTriangle();
		reversed("Cengiz");
		giveMeName();
	}
	
	//find uniques
	
	public static String findUniques(int [] arr) {
		
		String str= "";
		
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=0; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				str+=""+arr[i]+" ";
			}
		}
	
		return str;
	}
	
	
	public static void drawTriangle() {
		for(int i=0;i<5; i++) {
			for(int j=5-i;j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}
	
	
	
	public static void reversed(String str) {
		
		String result="";
		for(int i=str.length()-1; i>=0; i--) {
			result+=str.charAt(i);
		}
		System.out.println(result);
	}
	
	public static void giveMeName() {
		
		Set<String> names = new HashSet<>();
		names.add("Cengiz");
		names.add("Gul");
		names.add("Cengiz");
		names.add("Ceyda");
		
		System.out.println(names);
		
		
		
	}
	
	
	
	
	
	
	

}

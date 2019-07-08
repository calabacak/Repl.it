package JavaInterview;

import java.util.*;
public class Interview_Codings_Extra {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,4,5,5,6,6));
			// 123456
			list =	removeDup(list);
			System.out.println(list);
			
			devides(15, 3) ;
			
			System.out.println( same("abc", "cbb") );
			
			String str2 = removeDup("AABBCCDD");
			System.out.println(str2);
			
			FINRA();
			
			int max =maxValueinAnArray(new int[] {1,200,3,4,5,6,7});
			System.out.println(max);
			
		unique("AABBCCDDEFJHI") ;
		
		String str1 ="EEEEEEAAAAAABBCCDD";  // A2B2C2D2E2
		frequencies(str1);
		frequencies2(str1);
		frequencies3(str1);
		
		
	}
	
	
	/*
	 1. Create a method that can remove duplicated values from an 
		ArrayList.  
			Do not use Set interfaces.
	 */
	
	public static ArrayList<Integer> removeDup(ArrayList<Integer> list){
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
			for(int i=0; i <list.size(); i++) 
				if(!list2.contains(list.get(i)))
					list2.add(list.get(i));
			
			return list2;	
	}
	
	
	/*
	 2. Create a method that can divide two numbers without using division 
		operators and Math class.

	 */
	
	public static void devides(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("Invalid Number");
			return;
			}
			
		System.out.print(num1 +" devid by "+num2 +" is: ");
			int count =0;
			while(num1 >= num2) {
				num1 -= num2;
				count++;
				}
			System.out.println(count+" and remainder is "+num1);
			
		}	
	
	
	/* 
	 3. Write a method that check if a string is build out of the same letters 
	 as another string.
	 
	 same("abc","cab"); -> true   same("abc","abb"); -> false:
		// abc   abc
	*/
	
		public static boolean same(String a, String b) {
			
			char[] myar1 = a.toCharArray(), 
					myar2 = b.toCharArray();
			
			Arrays.sort(myar1); 
			Arrays.sort(myar2);
			
			String a1="", a2="";
				
			for(char each: myar1)
					a1 +=each;
			
			for(char each: myar2)
					a2 +=each;
				
			
			if(a1.equals(a2)) 
				return true;
			
			return false;	
		}
		
		
	/*
	  	4. Write a method that will remove all dublicates from string 
	  		removeDup("abcc") ; -> "abc"
	 */
		
		public static String removeDup(String a) {
			String b = "";
		    for (int i = 0; i < a.length(); i++) 
		        if (!b.contains("" + a.charAt(i))) 
		            b += "" + a.charAt(i);
		        
		    return b;	
			}
	
		
	/* 
	 5.  Write a method which prints out the numbers from 1 to 30 but for 
	 	numbers which are a multiple of 3, print "FIN" instead of the number 
		and for numbers which are a multiple of 5, print "RA" instead of 
		the number. for numbers which are a multiple of both 3 and 5, 
		print "FINRA" instead of the number.
		
	*/	
			public static void FINRA() {
				String[] myarr= new String[30];
				
				for( int i=0; i <= 29; i++ )
						myarr[i] = ""+(i+1);
				System.out.println(Arrays.toString(myarr));
				
				for(int j=0; j<myarr.length; j++)
					if(new Integer(myarr[j])%3==0 && new Integer(myarr[j])%5==0) 
						myarr[j]="FINRA";	
					else if (new Integer(myarr[j])%3==0) 
						myarr[j]="FIN";
					else if (new Integer(myarr[j])%5==0) 
						myarr[j]="RA";
				
				System.out.println(Arrays.toString(myarr));
			}
			
			
			
	/*
	  6. Write me a method which can identifies given number is even or odd  
	   identify(5) -> print "Odd"   
	    identify(6) -> print "Even"
	 */
		
		public static void identifyOddEven(int n) {
			if(n%2==0) 
				System.out.println("Even");
			else 
				System.out.println("odd");
		}
			
	
	/* 
	 	7. Write a method that returns max value out of array of integers, 
	 	and than Srtings.   int[] arr = {2,3,4};      max(arr) -> 4
	 		DO NOT use sort method
	 		
	 */
		public static int maxValueinAnArray(int[] n) {
			int max = Integer.MIN_VALUE;
			
			for(int each: n) 
				if(each > max)
					max = each;
			
			return max;
		}
			
	/*
	 	8. create a method that can find the unique characters from the String
	 		unique("AAABBBCCCDEF") ==> "DEF";
	 		
	 */
			
		public static void unique(String AA) {
			String[] arr=AA.split("");
			
			String unique1="";
			
			 for(int j=0; j<AA.length(); j++) {
				 int num=0;
					for(int i=0; i<arr.length; i++ ) {
						if(arr[i].equals(arr[j]) )
							num++;
					}
			    	if(num==1) unique1+=arr[j];	
			    }
			 
			 System.out.println(unique1);
		}
			
			
	/*
	 	9. create a method that can find the frequencies of the String:
	 		frequencies( "AAABBCCCCDDD") ==>  A3B2C4D3
	 		
	 */
				// first way:
			public static void frequencies(String str) {
				String str2 ="", str3="";
				for(int i=0; i<str.length(); i++) 
					if(!str2.contains(""+str.charAt(i)))
						str2 += str.charAt(i);		
			
				for(int z=0; z<str2.length(); z++) {
					int num=0;
				for(int i=0; i<str.length(); i++) 
					if(str.substring(i, i+1).equals(str2.substring(z, z+1))) 
						num++;
			
				str3 +=""+str2.substring(z,z+1)+num;
				}
				
				System.out.println(str3);	
			}
			
					// second Way:
			public static void frequencies3(String str) {
				String b=new HashSet<>(Arrays.asList(str.split(""))).toString();
					   b = b.replace(", ","").replace("[","").replace("]","");
				String result="";
				for(int j=0; j<b.length();j++) {
					int times=0;
					for(int i=0; i<str.length(); i++)
						if(str.substring(i, i+1).equals(""+str.charAt(j)))
							times++;
					
						result+=b.substring(j,j+1)+times;
				}
				System.out.println(result);	
			}
			
			
				// third way:
		public static void frequencies2(String str) {
			
			String b=new HashSet<>(Arrays.asList(str.split(""))).toString();
					b = b.replace(", ","").replace("[","").replace("]","");
			String result="";
			for(int i=0; i<b.length(); i++) {
				int z= Collections.frequency(new ArrayList<>(Arrays.asList(str.split(""))),b.substring(i,i+1));
				result+=""+b.charAt(i)+z;
			}
			System.out.println(result);
		}
		
		
	
	/*
	 10. String reverse:
	 		
	 */
					// first way:
		public static void StrReverse(String str) {
			System.out.println( new StringBuffer(str).reverse().toString());
		}
		
					// second way:
		public static void StrReverse2(String str) {
			String reverse="";
			for(int i=str.length()-1; i>=0; i--)
				reverse += str.toCharArray()[i];
			
			System.out.println(reverse);
		}		
			
			
		
}


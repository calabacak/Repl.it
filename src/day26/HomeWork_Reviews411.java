package day26;

public class HomeWork_Reviews411 {
	public static void main(String[] args) {

////		113. Print even from 80 to 20
//		//Print odd from 80 to 20
//		for(int i=80; i>=20; i--) {
//			
//			if(i%2==0) {
//				if(i==20|| i==21) {
//					System.out.print(i);
//				}else {
//					System.out.print(i+", ");
//				}
//			}
//		}	
//		int i = 80;
//		while (i >= 20) {
//
//			if (i % 2 == 0) {
//				if (i == 20) {
//					System.out.print(i);
//				} else {
//					System.out.print(i + ", ");
//				}
//			}
//			i--;
//		}

//		int num=80;
//		
//		do {
//			if(num%2==1) {
//				if(num==21) {
//					System.out.print(num+".");
//				}else {
//					System.out.print(num+", ");
//				}
//			}
//			num--;
//		}while(num>=20);
		
		
//		int n =5;
//		for(int j=1; j<=n; j++) {
//			
//			System.out.print("*");
//		}
//		
		
//		Given int variables k and total that have already been declared, 
//		use a do...while loop to compute the sum of the squares of the first 50 counting numbers, 
//		and store this value in total. 
//		Thus your code should put 1*1 + 2*2 + 3*3 +... + 49*49 + 50*50 into total. 
//		Use no variables other than k and total. Print out value of variable total.
		
//		int num=1;
//		int squares = 0;
//		do {
//			squares+=num*num;
//			num++;
//		}while(num<=50);
//		
//		System.out.println(squares);
//		
		
//		email -> info@cybertekschool.com
//		Print:  
//		Email id: info
//		Email domain: cybertekschool.com
//
//
//		If email contains no @ character or multiple @ characters then print invalid email:
		
		
		
//		String email = "info@cybertekschool.com";
//		
//		int count=0;
//		for(int i=0; i<email.length(); i++) {
//			if(email.charAt(i)=='@') {
//				count++;
//			}
//		}if(count!=1) {
//			System.out.println("invalid email");
//		}else {
//			
//			String [] str = email.split("@");
//			
//			System.out.println("Email id: "+str[0]);
//			System.out.println("Email domain: "+str[1]);
			
			
//			System.out.println("Email id: "+email.substring(0,email.indexOf('@')));
//			System.out.println("Email domain: "+email.substring(email.indexOf('@')+1));

//		}
		
		
//		Given an array nums, calculate count of even numbers in nums and print out to console.
//
//		nums → [2, 1, 2, 3, 4]) → 3
		
		
//		int [] nums = {2,1,2,3,4,4,7,0,2};
//		int count=0;
//		for(int i=0; i<nums.length; i++) {
//			
//			if(nums[i]%2==0) {
//				count++;
//			}
//		} System.out.println(count);
		
		
		
		
//		Given a String variable sentence, write code to type each word in separate lines.
//
//		Example:
//		sentence -> "Java is fun"
//		Print
//		Java
//		is
//		fun
		
		
		String str = "Java is fun but demanding at the same time";
		int a = str.indexOf(' ');
		int b = str.indexOf(' ', a+1);
		int c = str.indexOf(' ', b+1);

		for(int i=0; i<str.length(); i++) {
			
			//System.out.println(str.substring(i,str.indexOf(' ')));
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		//String is immutable where as StringBuffer is mutable, lets explain this by an example
		
		String striw= new String("Cengiz");
		
		System.out.println(striw);
		
		striw.concat("alabacak");
		
		System.out.println(striw);
		
		
		StringBuffer striw2= new StringBuffer("Cengiz");
		
		striw2.append("alabacak");
		
		System.out.println(striw2);
		
		
		
		
	}

}

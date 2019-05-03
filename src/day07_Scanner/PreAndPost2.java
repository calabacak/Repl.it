package day07_Scanner;

public class PreAndPost2 {
	public static void main(String[] args) {
		int messages = 10;
		messages++;
		++messages;
		System.out.println(" Num of Messages= "+messages);
		
		int readMessages = --messages;
		System.out.println("Num of readMessages "+ readMessages);
		
		int unreadMessages = readMessages--;
		System.out.println("Num of unreadMessages= " + unreadMessages);
		
		System.out.println(" Num of Messages= "+readMessages);
		
		int total = unreadMessages++ - readMessages--;
		System.out.println("total = "+total);
		
		
		int count = 20;
		int count2 = 10;
		
		int totalCount = ++count + --count2;
		
		System.out.println(count);
		System.out.println(count2);
		System.out.println(totalCount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	}

}

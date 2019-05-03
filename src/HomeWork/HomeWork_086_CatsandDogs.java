package HomeWork;

import java.util.Scanner;

public class HomeWork_086_CatsandDogs {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = scan.next();
	    
	    
	    for(int i = 0; i<word.length()-2;i++) {
	    	if(word.substring(i, i+3).contentEquals("cat")){
	    		countOfCats+=1;
	    	}else if (word.substring(i, i+3).contentEquals("dog")){
	    		countOfDogs+=1;
	    	}
	    }//System.out.println(countOfCats);System.out.println(countOfDogs);
	    
	    if(countOfCats==countOfDogs) {
    		System.out.println(true);
    	}else System.out.println(false);
    
	    
	  }
	}



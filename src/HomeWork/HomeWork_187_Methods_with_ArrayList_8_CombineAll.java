package HomeWork;
import java.util.*;

public class HomeWork_187_Methods_with_ArrayList_8_CombineAll {
	
	
	public static ArrayList<String> combineAL(ArrayList<String> wordList1,ArrayList<String> wordList2){
		
		ArrayList<String> resultList=new ArrayList<String>();
		
		for(String s: wordList1) {
			resultList.add(s);
		}
		for(String s: wordList2) {
			resultList.add(s);
		}
		
		return resultList;
		
	}
		
		
	

}

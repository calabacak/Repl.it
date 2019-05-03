package HomeWork;

public class HomeWork_169_MethodsWithString4 {

	public static int wordCount(String words) {
	    int count=0;
	    for(int i=0; i<words.length();i++){
	      if(words.charAt(i)==' '){
	        count++;
	      }
	    }
	  return count+1;
	}
}
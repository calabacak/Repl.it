package HomeWork;

public class HomeWork_166_Methods_10 {
	public static void main(String[] args) {
		System.out.println(mergeStrings("cengiz", "ceydam"));
	}
	
	public static String mergeStrings(String one, String two) {
	    
	    int a = one.length();
	    int b = two.length();
	    String str="";
	    
	    if(a>b) {
	    	
	    	for(int i=0; i<b; i++) {
	    	
	    		str+= one.charAt(i)+""+two.charAt(i);
	    		
	    	}
	    	String result= str+""+one.substring(one.length()-(a-b));
	    	return result;
	    }
	    else {
	    	for(int i=0; i<a; i++) {
		    	
	    		str+= one.charAt(i)+""+two.charAt(i);
	    		
	    	}
	    	String result= str+""+two.substring(two.length()-(b-a));
	    	return result;

	    }
	  
	}

}

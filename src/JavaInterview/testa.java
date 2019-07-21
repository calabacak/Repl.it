package JavaInterview;

public class testa {
	
	
	
	public static String[] combineNames(String[] first_names, String[] last_names) {
	
	String [] result = new String [first_names.length];
	
	for(int i=0; i<first_names.length;i++) {
		result[i]= first_names[i]+" "+last_names[i];
	}
	
	
		
		
		
		return result;
	}

}

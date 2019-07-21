package day65_Collections02;

public class wordAppend {
	
	/*
	 * Loop over the given array of strings to build a result string like this: 
	 * when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. 
	 * Return the empty string if no string appears a 2nd time.
	 */
	
	
	public String wordAppend(String[] strings) {
		String result="";
		
		for(int i=0; i<strings.length;i++) {
			if(!result.contains(strings[i])) {
				int count=0;
				for(int j=0; j<strings.length;j++) {
					if(strings[i].equals(strings[j])) {
						count++;
					}
				}
				if(count%2==0 || count>=2) {
					for(int k =0; k<count/2;k++)
					result+=strings[i];
				}
			}
		}
		
		
		
		
		 return result; 
	}

}

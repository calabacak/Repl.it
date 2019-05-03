package day33_methods5;

public class cdpractise {
	public static void main(String[] args) {
		
		System.out.println(wordEnds("XY123XY", "XY"));
	}
	
	public static String wordEnds(String str, String word) {
		  
		  int a= str.indexOf(word);
		  int l=str.lastIndexOf(word);
		  int b= word.length();
		  int c=str.length();
		  String end="";
		  
		  String front="";
		  if(a==0){
		    front=""+str.charAt(b);
		  }else if(l==c-a){
		    end=""+str.charAt(c-1);
		  }
		  String res="";
		  for(int i=1; i<c-1; i++) {
			  String sstr=str.substring(i, i+b);
			  if(sstr.equals(word)) {
				  res+=str.charAt(i-1)+""+str.charAt(i+1);
			  }
		  }
		  
		  return front+res+end;

}
}

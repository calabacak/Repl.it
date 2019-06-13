package HomeWork;

import java.util.ArrayList;

public class HomeWork_230_Methods_with_ArrayList_17_blog_post_db {
//public class Main{
	public String blogDb(ArrayList<String[]> r, String id) {
		
		
			if(r.get(0)[0].contentEquals(id)) {
				return r.get(0)[1]+"\n"+ r.get(0)[2];
				
			}else if(r.get(1)[0].contentEquals(id)) {
				return r.get(1)[1]+"\n"+ r.get(1)[2];
				
			}
			return r.get(2)[1]+"\n"+ r.get(2)[2];
		
		
	}
	
	
//	public static void main(String[] args) {
//	    Main m = new Main();
//	    ArrayList<String[]>  arr = new ArrayList<String[]>();
//	    arr.add(new String[]{"1","title 1","content"});
//	    arr.add(new String[]{"2","title 2","content"});
//	    arr.add(new String[]{"3","title 3","content3"});
//
//	    String post = m.blogDb(arr,"1");
//	    System.out.print(post);
//	    //should output:
//	    //title 3 
//	    //content3
//	   
//	    
//	  }//end main
	}
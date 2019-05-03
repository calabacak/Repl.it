package HomeWork;

public class HomeWork_156_Methods_with_return_1 {
	public int  count_appearance(String[] arr,String t)
	  {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].contentEquals(t)) {
				count++;
			}
		}
	   return count;
	  } //end  count_appearance
	  

	}



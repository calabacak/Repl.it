package exam_06022019;

public class AppearsTwice {
	public static void main(String[] args) {
	//	Main.appearsTwice("java", "java is fun!") - returns false, because java appears only once.
	//	Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.") //- returns true, because laptop appears twice.
		
		
	}
	public static boolean appearsTwice(String target, String sentence) {
		
		String [] arr = sentence.split(" ");
		
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].replace(",", "").contentEquals(target)) {
				count++;
			}
		}
		
		if(count==2) {
			return true;
		}
		return false;
	}

}

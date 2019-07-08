package OCA_Quizes;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class q44 {
	
	public static void removeEveryOther(ArrayList<String> list) {
		
		
		for(int i=0; i<list.size();i=i+2) {
			list.remove(list.get(i));
			i--;
		}
		
	}

}

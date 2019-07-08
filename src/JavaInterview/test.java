package JavaInterview;
import java.util.*;

public class test {
	public static void main(String[] args) {
		
		String [] result = new String[30];
		for( int i=0; i <= 29; i++ )
			result[i] = ""+(i+1);
	System.out.println(Arrays.toString(result));
		
		
		for(int i=0; i<30; i++) {			
			if(Integer.parseInt(""+(i+1))%15==0)
				result[i]="FINRA";
			else if(Integer.parseInt(""+(i+1))%5==0)
				result[i]="RA";
			else if(Integer.parseInt(""+(i+1))%3==0)
				result[i]="FIN";
		}
		
		System.out.println(Arrays.toString(result));
	}

}

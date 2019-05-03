package day23_Arrays;

public class PractiseContinue {
	public static void main(String[] args) {
		
		for(int i=1; i<=50; i++) {
			
			if(i%5==0) {
				continue;
			}else if (i%21==0) {
				break;
			}System.out.print(i+"\t");
		}
	}

}

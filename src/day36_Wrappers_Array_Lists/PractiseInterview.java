package day36_Wrappers_Array_Lists;

public class PractiseInterview {
	public static void main(String[] args) {
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}for(int k=4-i; k>0;k--){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}

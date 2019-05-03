package day23_Arrays;

public class MultiplacationTable2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
		System.out.print("\t"+i);
		}
		System.out.println();System.out.println();
		///////////////////////////////////////////////
		for (int i = 1; i <=12; i++) {
			System.out.print(i+"\t");
			for (int j = 1; j <= 12; j++) {
				System.out.print(""+i*j+"\t");
				
			}System.out.println();System.out.println();
		}	

	}

}

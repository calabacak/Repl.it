package day24;

public class Java_Coding_Challenge_07_1 {
	public static void main(String[] args) {
		
//		Question 1:
//			Write nested enhanced for-loop to iterate through following 2-Dimensional array:
			char [][] arr = {
			{'*'},
			{'*', '*'},
			{'*', '*', '*'},
			{'*', '*', '*', '*'},
			{'*', '*', '*', '*', '*'},
			{'*', '*', '*', '*', '*', '*'},
			{'*', '*', '*', '*', '*', '*', '*'},
			};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		//or lets try enhanced loop
		System.out.println("==========================");
		
		for(char [] c : arr) {
			for(char y :c) {
				System.out.print(y);
			}System.out.println();
		}
		
		
		
		
		
		
	}

}

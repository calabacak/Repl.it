package HomeWork;
public class Array_understand {
	public static void main(String[] args) {      
		
			//2-D array instantiated with Data
			char [][] vowels = {
					{'a', 'A'}, 
					{'e', 'E'},
					{'i', 'I'},
					{'o', 'O'},
					{'u', 'U'}
			};
			
			//nested regular for loops to print all the elements in 2-D array
			for(int i = 0; i < vowels.length; i++){
				for(int j = 0; j < vowels[i].length; j++) {
					System.out.print(vowels[i][j]+ "\t"); //Print all the elements on the same line
				}
				System.out.println(); //Print a new line after inner loop finishes its execution.
			}
			
			System.out.println("-------------------");
			
			//nested for-each loops to print all the elements in 2-D array
			for(char [] rows : vowels) {
				for ( char col : rows) {
					System.out.print(col + "\t"); //Print all the elements on the same line
				}
				System.out.println(); //Print a new line after inner loop finishes its execution.
			}
		}
	}



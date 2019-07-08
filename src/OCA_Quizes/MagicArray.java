package OCA_Quizes;

public class MagicArray {

		public static void main(String[] args)
		{
			int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
			System.out.println(isMagic(a)); //true
			int[][] b = {
				{1,1,2},
				{3,2,3},
				{1,4,1}
			};
			System.out.println(isMagic(b)); //false
			int[][] c = {
				{1,1,1},
				{2,2,2}
			};
			System.out.println(isMagic(c)); //false
			int[][] d = {
				{8,1,6},
				{3,5,7},
				{4,9,2}
			};
			System.out.println(isMagic(d)); //true
		}
		
		
		
		
		
		public static boolean isMagic(int[][] array) {
			
			boolean result = true;
		
			for (int row = 0; row < array.length; row++) {
		        if (array[row].length != array.length) {
		            result = false;
		        }
		    }
		int [] newa= new int[array[0].length];
			
			//1
			int sum1=0;
			for(int i=0; i<array.length; i++) {
				for(int j=0; j<array[i].length;j++) {
					newa[i]+=array[i][j];		
				}
				//if(new[])
			}
		
		
		
			
			
			return true;
	
	  
	}
}
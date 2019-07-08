package day63_exception_handling_2;

public class PanicException2_TEST {
	public static void main(String[] args) {
		
		
		
		
		try {
			throw new PanicException("Cengiz this is my exception");
		}catch(PanicException p){
			System.out.println("caught by cengiz");
			System.out.println(p.getMessage());
			p.printStackTrace();
		}
		
	}
	
	 
}


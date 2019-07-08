package OCA_Quizes;

public class Blocks {
	
	int a;
	static {	
	System.out.println("static block");	
	}

	
	{	System.out.println("1st init block");
	}
	
	
	{System.out.println("2nd init block");	
	}
	
	public Blocks(int a) {
		this.a=a;
		System.out.println("constructor");
	}

	@Override
	public String toString() {
		return "Blocks [a=" + a + "]";
	}
	
	
}

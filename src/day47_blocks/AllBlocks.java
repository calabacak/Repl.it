package day47_blocks;

public class AllBlocks {
	
	int nonStaticInt=10;
	static int StaticInt=10;
	
	
	static {
		System.out.println("STATIC Block- I run first and only once");
		StaticInt--;
	}

	{
		System.out.println("INIT Block- I run each time once object is created before constructor");
		nonStaticInt+=5;
		StaticInt+=5;
	}

	public AllBlocks() {
		System.out.println("CONSTUCTOR- I run each time once objcet is created after constructor ");
		nonStaticInt+=3;
		StaticInt+=3;
		
	}
}

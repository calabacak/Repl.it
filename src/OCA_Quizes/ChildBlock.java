package OCA_Quizes;

public class ChildBlock extends Blocks{
	
	static {
		System.out.println("child static");
	}
	
	{
		System.out.println("init child");
	}

	public ChildBlock(int a) {
		super(a);
System.out.println("child cons");
	}

}

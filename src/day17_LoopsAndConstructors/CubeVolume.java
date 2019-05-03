package day17_LoopsAndConstructors;

public class CubeVolume {						//class name is Cube Volume
	
	public int length;
	private int bredth;
	public int height;
	
	public int getCubeVolume() {
		
		return(length*getBredth()*height);
	}
	
	CubeVolume(){								//same name as class
												//constructors never return values	
												//System.out.println("I am stduying constuctors");
		length = 10;
		setBredth(20);
		height = 30;	
	}
	
	CubeVolume(int l,int b,int h){								
length = l;
setBredth(b);
height = h;	
}

	public int getBredth() {
		return bredth;
	}

	public void setBredth(int bredth) {
		this.bredth = bredth;
	}
	
	
	
}

package MyMentoring;

public class Cat {
	
	private String name;
	private int size;
	
	public void info() {
		System.out.println(name+ " is a dog with a size: "+ size);
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		if(name.charAt(0)=='P') {
			this.name = name;
		}else {
			System.out.println("Please enter a name start with P other wise I will name it Popi");
			this.name="Popi";
		}
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size>=3 && size<=6) {
			this.size = size;
		}else {
			System.out.println("please enter a valid size should be 3 to 6 other wiese i will assign 3");
			this.size=3;
		}
		
	}

	
	
}

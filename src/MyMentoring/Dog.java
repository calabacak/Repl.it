package MyMentoring;

public class Dog {

	private String name;
	private int size;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.charAt(0) == 'P') {
			this.name = name;
		}else {
			System.out.println("enter a name starts with P other wise name will be Pino");
			this.name = "Pino";
		}
	
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size > 0) {
			this.size = size;
		}else {
			System.out.println("Please enter a reasonable size other wise I will assign 1");
			this.size = 1;
		}
		
	}

	public void info() {
		System.out.println(name + " barks and its size is " + size);
	}

}

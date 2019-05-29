package OPPsCengiz;

public class Participant {
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws NegativeNumberException {
		
		if(age<0) {
			throw new NegativeNumberException();
		}
		this.age = age;
	}

	
	
}

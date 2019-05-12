package day42_customclasses_encapsulation;

public class Person {
	
	private String name;//this.name
	private int age;
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// public getter and setter methods
	//read only
	public String getName() {
		return name;
	}
	//write only
	public void setName(String name ) {
	if(name.isEmpty()) {
		this.name="Kurtulus";
	}else
		this.name=name;//this.name is instance variable
	}
	
}

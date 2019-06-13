package HomeWork;
// homework 225. OOP 17 - Dog
public abstract class Animal {
	// Write an abstract class Animal that contains 2 instance variables: name and age.
	//Write a class Dog that extends the Animal class.
	
	private String name;
	private int age;

	//Define 2 args constructor that initializes instance variables.
	
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	
	
	//Add an abstract method getAgeInHumanYears() that returns int.
	
	public abstract int getAgeInHumanYears();


	//Provide getters and setters for these variables. 
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

}

package HomeWork;
//homework 225. OOP 17 - Dog

//Write a class Dog that extends the Animal class.
public class Dog extends Animal {
	//Define 2 instance variables for this class: breed (String) and humanYears (int).
	private String breed;
	private int humanYears;
	
	

	
	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public int getHumanYears() {
		return humanYears;
	}


	public void setHumanYears(int humanYears) {
		this.humanYears = humanYears;
	}


	//Add a constructor that accepts three String parameters. The value of the first is used to initialize the value of name, 
	//the value of the second is used to initialize age and the value of the third is used to initialize breed.
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed=breed;
	}

	
	// Override toString() method, so it will display Dog info as in the example below:
	public String toString() {
		return "Name: "+ super.getName()+"\n"+"Breed: "+breed+"\n"+"Age in calendar years: "+super.getAge()+"\n"+"Age in human years: "
	+getAgeInHumanYears();
	}
	//if dogs age is less or equals to 2, multiple age by 11;
	//otherwise, human years is equals to: 22 + ((age-2) * 5);
	@Override
	public int getAgeInHumanYears() {
		if(getAge()<=2) {
			return 2*11;
		}
		return 22+(getAge()-2)*5;
	}
	
	//Define an equals method for the Dog class that returns true if the dog’s name, 
	//age, and breed match the same variables for the other object that is being compared.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Dog) {
			Dog dog= (Dog) obj;
			boolean result= this.getName()==dog.getName() && this.getAge()==dog.getAge()&& this.getBreed()==dog.getBreed();
			return result;
		
		}
		
		return false;
	}

}

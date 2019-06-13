package day56_abstraction_02;

public class Action extends Movie{

	public Action(String rating, int idNumber, String title, Director director) {
		super(rating, idNumber, title, director);
	
	}

	
	public  double calcLateFees(int numOfDays) {
		return numOfDays*3;
	}


	@Override
	public String toString() {
		return "Action [getRating()=" + getRating() + ", getIdNumber()=" + getIdNumber() + ", getTitle()=" + getTitle()
				+ ", getDirector()=" + getDirector() + "]";
	}


	
}

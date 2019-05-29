package day49_inheritance_02;

public class AudioBook extends Book{
	private int length;
	private String narrator;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String setNarrator() {
		return narrator;
	}
	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}
	
	public void listen() {
		System.out.println("listening " + getTitle() + " by author "+ getAuthor()+ " narrated by "+ narrator );
		
	}

}

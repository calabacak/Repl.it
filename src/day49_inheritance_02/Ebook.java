package day49_inheritance_02;

public class Ebook extends Book{
	
	private double size;
	private int pages;

	
	
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public void readEbook(int pageNum) {
		System.out.println("reading " + getTitle() + " by author "+ getAuthor()+ " at page "+ pageNum );
	}
	
	

}

package day49_inheritance_02;

public class BookStore {
	public static void main(String[] args) {
		
		Ebook ebook = new Ebook();
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170.0);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		
		ebook.readEbook(19);
		ebook.readEbook(621);
		
		
		AudioBook aBook = new AudioBook();
		aBook.setTitle("OCA prepration");
		aBook.setAuthor("Jeanne");
		aBook.setNarrator("Marufjon");
		aBook.listen();
		
		
		
	
		
		
	}

}

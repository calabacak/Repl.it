package day15;

public class GoogleSearchTest {
	public static void main(String[] args) {
		
		String searchItem = "Java";
		
		String pageTitle = searchItem + "- Google Search";
		
		if(pageTitle.startsWith(searchItem)) {
			System.out.println("Page title check passed");
		}else {
				System.out.println("FAIL : Page title check failed");
		}
	}

}

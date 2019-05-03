package HomeWork;

import java.util.Scanner;

public class HomeWork_094_Parse_HTML {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   String html = scan.nextLine();
			//String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"mynewid\"></p></body></html>";
			html = html.toLowerCase();
			if(html.contains("id=")) {
				System.out.println(html.substring(html.indexOf("id=")+4, html.lastIndexOf("\"")));
				
			}else System.out.println("Invalid input!");
						
					}

				}

package day52_inheritance05;

import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import static java.lang.System.out;

class SocketClient_v2 {
	public static void main (String... params) {
		String      s;
		Scanner     inputStream;
		PrintWriter outputStream;
		Scanner console = new Scanner(System.in);
		out.print("Enter name: ");
		String name = console.nextLine();
		try {
			Socket clientSocket = new Socket("Omen-646" ,6789);
			inputStream  = new Scanner(new InputStreamReader(clientSocket.getInputStream()));
			outputStream = new PrintWriter(new DataOutputStream(clientSocket.getOutputStream()));
			outputStream.println(name);
			outputStream.flush();
			while (inputStream.hasNextLine()) {
				s = inputStream.nextLine();
				out.println(s);
			}
			inputStream.close();
			outputStream.close();
		} catch (Exception e) {
			out.println("Error " + e);
		}
	}
}
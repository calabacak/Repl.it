package day45_encapsulation_practice;

import java.util.Random;

public class EtsyAccount {

	private String email;
	private String firstName;
	private String password;

	// first consructor no args, set all as empty string
	public EtsyAccount() {
		email = "";
		firstName = "";
		password = "";
	}

	// secon constructor
	public EtsyAccount(String email, String firstName, String password) {
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);

	}
	
	//third constructor
	public EtsyAccount(String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password=getRandomPassword();
	}
	
	private String getRandomPassword() {
		Random rd= new Random();
		String letters="abcdefghijklmnopqrstuvwxyz0123456789";
		String rdPassword="";
		
		for(int i=1; i<=6; i++) {
			rdPassword+=letters.charAt(rd.nextInt(letters.length()));
			
		}
		return rdPassword;
		
	}
	
	@Override
	public String toString() {
		return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.indexOf('@') > 0 && email.lastIndexOf('@') < email.length() - 1) {
			this.email = email;
		} else {
			System.out.println("Please enter a valid email address");
		}

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		// Can't be blank.
		// needs to be only Alphabetic/letters
		if (isValidFirstName(firstName)) {
			this.firstName = firstName;
		} else {
			System.out.println("Your first name contains invalid characters.");
		}
	}

	private boolean isValidFirstName(String firstName) {
		// check first if it starts with or ends with space
		// return false if true
		if (firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}

		if (firstName.isEmpty()) {
			System.out.println("Cannot be blank.");
			return false;
		}

		for (int i = 0; i < firstName.length(); i++) {
			char ch = firstName.charAt(i); // %
			if (!Character.isAlphabetic(ch) && ch != ' ') {
				return false;
			}
		}

		return true;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Must be at least 6 characters");
			password = "";
		} else {
			this.password = password;
		}

	}

}

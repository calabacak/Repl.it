package day53_inheritance06;

public class Phone {
	/*
	 * Write a Phone class with a constructor that accepts two parameters: 
a string for the phone number followed by a boolean representing whether the phone provides added-value services. 

Then, create a subclass MP3Phone has been defined that has two instance variables: 
an integer, memorySize, for the size, in megabytes of the phone memory, and a boolean, playsAAC, 
representing whether the phone is capable of playing AAC-encoded audio files. 

Write a constructor for MP3Phone that accepts three parameters: a
String for the phone number (which is passed up to the Phone constructor, 
together with the value true for the added-value boolean),
and an integer followed by a boolean for the instance variables.
	 */

	    private String phoneNumber;
	    private boolean addedValueServices;
	    
	    public Phone(String phoneNumber, boolean addedValueServices) {
	        this.phoneNumber=phoneNumber;
	        this.addedValueServices=addedValueServices; 
	    }
	    @Override
	    public String toString() {
	        return "Phone [phoneNumber=" + phoneNumber + ", addedValueServices=" + addedValueServices + "]";
	    }
	}

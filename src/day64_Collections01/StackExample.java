package day64_Collections01;
import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		
		Stack <Integer> numsStack = new Stack<>();
		numsStack.add(50);
		numsStack.add(60);
		numsStack.push(35);
		System.out.println(numsStack.toString());
		System.out.println(numsStack.peek());
		System.out.println(numsStack.get(0));
		//read the value on the top and remove it
		System.out.println(numsStack.pop());
		System.out.println(numsStack.peek());
	}

}

package MAP_Cengiz;

import static java.lang.System.*;
import java.util.HashMap;

/*
 * This example source code demonstrates the use of  
 * replace(K key, V value) method of HashMap class
 */

public class HashMapReplaceExample {

	public static void main(String[] args) throws InterruptedException {

		// get the HashMap object from the method init()
		HashMap<Integer, String> map = init();
		// replace the id 18975 with a new student
		String result = map.replace(73654, "Darwin Bocalbos");
		if (result != null) {
			out.println("Student " + result
					+ " has been replaced on the student database");
		} else {
			out.println("Specified student not found");
		}

	}

	private static HashMap<Integer, String> init() {
		// declare the HashMap
		HashMap<Integer, String> mapStudent = new HashMap<>();
		// put contents to our HashMap
		mapStudent.put(73654, "Shyra Travis");
		mapStudent.put(98712, "Sharon Wallace");
		mapStudent.put(71245, "Leo Batista");
		return mapStudent;
	}

}

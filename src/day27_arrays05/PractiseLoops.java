package day27_arrays05;

public class PractiseLoops {
	public static void main(String[] args) {
//		
//		Java --> programming language
//		Selenium --> Test Automation
//		TestNG --> Unit Tests
//		JUnit --> Unit Tests
//		Cucumber --> BDD Style testing
//		Git --> Version control
//		Maven --> Building and execution for project

		String[] tools = { "Java", "Selenium", "TestNG", "JUnit", "Cucumber", "Git", "Maven" };

		String[] goals = { "programming language", "Test Automation", "Unit Tests", "Unit Tests", "BDD Style testing",
				"Git", "Version control", "Building and execution for project" };

		for (int i = 0; i < tools.length; i++) {
			System.out.println(tools[i] + " is used for " + goals[i]);
		}

	}

}

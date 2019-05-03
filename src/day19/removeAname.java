package day19;

public class removeAname {

	public static void main(String[] args) {

		String [] strs = {"Ahmed", "Cengiz", "Ahmed", "Ali", "John"};

		String [] newStrs= new String [strs.length];

		for(int i = 0; i<strs.length; i++) {
			if(!strs[i].contentEquals("Ahmed")) {
				newStrs[i]=strs[i];		
			}
		}
		for(String names:newStrs) {
			if(names!=null) 
			{
				System.out.println(names);
			}

		}

	}

}


//int [] nums = {1,6,121,34,154,122,3,4,5,};
//int [] newNums= new int[nums.length];
//
//for(int i=0;i<nums.length;i++) {
//	if(nums[i]<100) {
//		newNums[i]+=nums[i];
//}for(int element:newNums) {
//	if(element!=0)
//	System.out.println(element);




//Questions for Finra before Phone Call (with Recruiter) 
//Q1. Assume you have 2 database tables, table 1 and table 2, both have the exact 
//same column names and data types. 
//The ask is to write a SQL query to verify that the data in table 1 is exactly the same as in table 2. 
//Q2. Can you write a query to retrieve fully duplicated records from a database table
//Q3. Given a list of people’s names “Ahmed”,”John”,”Eric” , 
//write a java operation to remove all the names named “Ahmed”
//Q4. Given a list of integers 1,2,3,4,5,6,... remove all values greater than 100Q
//5. How can we monitor the JVM in a production environment?Q
//6. what are the +ve , -ve and edge condition test scenarios for the above java method? 
//Q7. What is the difference between load test/stress test/functional test






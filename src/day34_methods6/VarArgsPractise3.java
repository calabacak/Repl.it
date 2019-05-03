package day34_methods6;

public class VarArgsPractise3 {

	public static void main(String[] args) {
		System.out.println(sum(3, 4, 8));

	}

	public static int sum(int... nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
}

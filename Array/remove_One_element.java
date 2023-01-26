package Array;

public class remove_One_element {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 1, 2 };

		int c = 0;
		int p = 0;

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] >= nums[i + 1]) {
				// two pointer approach
				c++;
				p = i;

			}

		}
		
	}

}

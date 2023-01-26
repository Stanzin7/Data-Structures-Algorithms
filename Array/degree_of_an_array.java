package Array;

public class degree_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 2, 3, 1, 4, 2, 1, 8, 9 };

		int ans = 0;
		int start = 0;
		int end = 0;
		int min = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			int count = 1;
			while (j < nums.length) {
				if (nums[i] == nums[j]) {
					if (count >= ans) {

					}
					end = j;
					start = i;
					count++;
				}
				j++;

			}
			
	
			min = Math.min(min, end - start);

			ans = Math.max(ans, count);

		}

		System.out.println(end);

	}

}

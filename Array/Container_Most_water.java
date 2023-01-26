package Array;

public class Container_Most_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,1 };
		// think about width

		int i = 0;
		int j = nums.length - 1;
		int ans = 0;
		while (i <= j) {
			// calculate width first
			int width = Math.abs(i - j);
			// check left
			if (nums[i] <= nums[j]) {
				ans = Math.max(ans, width * nums[i]);
				i++;
				
			} else if (nums[i] >= nums[j]) {
				ans = Math.max(ans, width * nums[j]);
				j--;
			}

		}
		System.out.println(ans);

	}

}

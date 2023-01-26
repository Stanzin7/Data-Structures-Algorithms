package Array;

public class min_max_removal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 10, 7, 5, 4, 1, 8, 6 };

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		int x = 0;
		int y = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
				x = i;
			}
			if (nums[i] < min) {
				min = nums[i];
				y = i;
			}
		}

		int linear = Math.max(y + 1, x + 1); // easy
		System.out.println(linear);

		// check count

		int circ = Math.min(y+1, x+1) + nums.length + 1 - linear;
		System.out.println(circ);

		int back = nums.length - Math.min(y, x);
		System.out.println(back);

		System.out.println(Math.min(linear, Math.min(back, circ)));
	}

}

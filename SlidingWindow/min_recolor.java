package SlidingWindow;

public class min_recolor {

	public static void main(String[] args) {

		String blocks = "WBBWWBBWBW";
		int k = 4;

		System.out.println(checkMax(blocks, k));
	}

	private static int checkMax(String blocks, int k) {

		int ei = 0;
		int ans = Integer.MAX_VALUE;
		int count = 0;

		int bl = 1; // check for consecutive black box
		while (ei < blocks.length() - 1) {

			if (blocks.charAt(ei) == 'W') {
				System.out.println(ei + " "+ count);
				count++;
				bl = 0;
			}		
			if (blocks.charAt(ei) == blocks.charAt(ei + 1)) {
				bl++;
			}	
			
			if (ei + 1 == k) {
				ans = Math.min(ans, count);
			}
			
			if (bl == k) {
				return 0;
			}

			ei++;
		}

		if (blocks.charAt(ei) == 'W') {
			count++;
		}
		if (ei + 1 == k) {
			ans = Math.min(ans, count);
		}

		return ans;

	}

}

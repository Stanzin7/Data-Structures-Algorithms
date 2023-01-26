package Array;

import java.util.ArrayList;

public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] candies = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;

		ArrayList<Boolean> ans = new ArrayList<>();
		int hi = Integer.MIN_VALUE;
		for (int i = 0; i < candies.length; i++) {
			hi = Math.max(candies[i], hi);
		}
		
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= hi) {
				ans.add(true);
			} else {
				ans.add(false);
			}
		}
		System.out.println(ans);

	}

}

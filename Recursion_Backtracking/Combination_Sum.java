package Recursion_Backtracking;

import java.util.*;

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = { 2, 3, 6, 7 };
		int t = 7;
		List<Integer> ans = new ArrayList<>();
		List<List<Integer>> ll = new ArrayList<>();
		CheckCombination(c, t, ans, 0, ll);
		System.out.println(ll);

	}

	private static void CheckCombination(int[] c, int t, List<Integer> ans, int idx, List<List<Integer>> ll) {

		if (t == 0) {
			ll.add(new ArrayList<>(ans));
			return;
		}

		for (int i = idx; i < c.length; i++) {
			if (t >= c[i]) {
				ans.add(c[i]);
				CheckCombination(c, t - c[i], ans, i, ll); // in the argument we can only pass address	
				ans.remove(ans.size()-1);
			}
			
		}

	}

}

package Recursion_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = { 10, 1, 2, 7, 6, 1, 5 };
		Arrays.sort(c);
		int t = 8;
		ArrayList<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Findcombination(c, t, ll, ans, 0);

	}

	private static void Findcombination(int[] c, int t, ArrayList<Integer> ll, List<List<Integer>> ans, int idx) {

		if (t == 0) {
		
			System.out.println(ll);
			return;
		}

		for (int i = idx; i < c.length; i++) {
			
			if (i != idx && c[i] == c[i - 1]) {
				continue;
			} else {
			
				if (t >= c[i]) {
					ll.add(c[i]);
					Findcombination(c, t - c[i], ll, ans, i + 1);
					ll.remove(ll.size() - 1);

				}
			}
		}

	}

}

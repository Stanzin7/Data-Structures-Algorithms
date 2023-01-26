package Recursion_Backtracking;

import java.util.*;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 1, 1, 2 };
		Arrays.sort(num);
		ArrayList<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		boolean[] bf = new boolean[num.length];

		generatePermu(num, 0, bf, ll, ans);
		System.out.println(ans);

	}

	private static void generatePermu(int[] ques, int idx, boolean[] bf, ArrayList<Integer> ll,
			List<List<Integer>> ans) {

		if (ll.size() == ques.length) {
			ans.add(new ArrayList<>(ll));
			return;

		}
		for (int i = idx; i < ques.length; i++) {
			
			if(bf[i] || i != idx && ques[i] == ques[i-1] && bf[i-1] == false) {
				continue;
			} else {
				// update visit
				bf[i] = true;
				ll.add(ques[i]);
				generatePermu(ques, idx+1, bf, ll, ans);
				ll.remove(ll.size() - 1);
				//update visit
				bf[i] = false;
			}

		}

	}

}
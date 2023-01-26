package Recursion_Backtracking;

import java.util.ArrayList;

public class dice_turn {

	public static void main(String[] args) {

		int n = 4;
		ArrayList<String> ans = new ArrayList<>();
		BoardPath(n, 0, "", ans);
		System.out.println(ans);

	}

	public static void BoardPath(int end, int curr, String ans, ArrayList<String> ans2) {

		if (curr > end) {
			return;
		}
		
		if (curr == end) {
			ans2.add(ans);
			return;
		}

		for (int i = 1; i < end; i++) {
			BoardPath(end, curr + i, ans + i, ans2);
		}	

	}

}

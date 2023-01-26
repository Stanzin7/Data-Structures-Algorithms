package Recursion_Backtracking;

public class coin_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coin = { 2, 3, 5, 6 };
		int t = 10;
		coinPermutation(coin, t, 0, "");
	}

	private static void coinPermutation(int[] coin, int t, int idx, String ans) {

		// Doesn't need backtracking Because, question doesn't specify
		// Combination
		if (t == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = idx; i < coin.length; i++) {
			if (t >= coin[i]) {
				coinPermutation(coin, t - coin[i], i, ans + coin[i]);
			}

		}
	}

}

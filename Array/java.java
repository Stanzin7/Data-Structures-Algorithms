package Array;

import java.util.*;

public class java {

	public static void main(String[] args) {
		boolean[][] board = new boolean[3][3];
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
		knightTour(board, 0, 0, 0, l, ans);
	}

	public static void knightTour(boolean[][] board, int r, int c, int tk, List<Integer> l, List<List<Integer>> ans) {
		if (tk == board.length) {
			ans.add(new ArrayList<>(l));
			return;
		}
		if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] == true) {
			return;
		}
		
		int[] x = { 1, 2, 2, 1, -1, -2, -2, -1 };
		int[] y = { 1, 2, 2, 1, -1, -2, -2, -1 };
		for (int i = 0; i < x.length; i++) {
			board[r][c] = true;
			l.add(r);
			l.add(c);
			knightTour(board, r + x[i], c + y[i], tk + 1, l, ans);
			l.remove(l.size() - 1);
			l.remove(l.size() - 1);
			board[r][c] = false;
		}
	}
}

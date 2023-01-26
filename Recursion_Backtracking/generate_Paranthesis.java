package Recursion_Backtracking;

import java.util.*;

public class generate_Paranthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> ans = new ArrayList<>();
		GenerateParanthesis(n, 0, 0, n, "");
	}

	private static void GenerateParanthesis(int n, int open, int close, int end, String ans) {

		if(open ==n && close == n) {
			System.out.println(ans + "");
			return;
		}		
		
		if (open < n) {
			GenerateParanthesis(n, open + 1, close, end, ans + '(');
		}
		if (close < open) {
			GenerateParanthesis(n, open, close + 1, end, ans + ')');
		}

	}

}

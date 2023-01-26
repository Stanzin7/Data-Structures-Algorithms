package Recursion_Backtracking;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc";
		generate_subsequence(str, "");

	}

	private static void generate_subsequence(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = str.charAt(0);
		generate_subsequence(str.substring(1), ans);
		generate_subsequence(str.substring(1), ans + ch);

	}

}

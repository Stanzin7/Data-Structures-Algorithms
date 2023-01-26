package Recursion_Backtracking;

import java.util.Scanner;

public class Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println("\n" + generateSequence(str, ""));

	}

	private static int generateSequence(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.print(ans+ " ");
			return 1;
		}

		char ch = ques.charAt(0);
		int f1 = generateSequence(ques.substring(1), ans);
		int f2 = generateSequence(ques.substring(1), ans + ch);
		return f1 + f2;

	}

}

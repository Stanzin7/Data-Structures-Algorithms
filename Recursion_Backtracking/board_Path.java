package Recursion_Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class board_Path {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		int n1 = sc.nextInt(); // rows
		int n2 = sc.nextInt(); // columns
		System.out.println("\n"+ totalPath(n1, n2, 0, 0, ""));
	}

	public static int totalPath(int n1, int n2, int cr, int cc, String ans) {
		if (cr == n1 - 1 && cc == n2 - 1) {
			System.out.print(ans+ " ");
			return 1;
		}
		if (cr >= n1 || cc >= n2)
			return 0;

		int a = 0;
		if (cr < n1) {
			a += totalPath(n1, n2, cr + 1, cc, ans + "V");
		}
		int b = 0;
		if (cc < n2) {
			b += totalPath(n1, n2, cr, cc + 1, ans + "H");
		}
		return a + b;
	}
}
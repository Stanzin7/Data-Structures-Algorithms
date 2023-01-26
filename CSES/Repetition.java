package CSES;

import java.util.Scanner;

public class Repetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		findrepitition(str);

	}

	private static void findrepitition(String str) {

		int count = 1;
		int ans = 1;
		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != str.charAt(i - 1)) {
				count = 1;
			} else {
				count++;
			}
			ans = Math.max(ans, count);
		}
		System.out.println(ans);

	}

}
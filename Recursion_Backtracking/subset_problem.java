package Recursion_Backtracking;

import java.util.Scanner;

public class subset_problem {

	public static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int c = 0;
			if (ch != ' ') {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == ch) {
						c++;
						str = str.substring(0, j) + ' ' + str.substring(j + 1);

					}

				}
			}
			if (c > 1)
				System.out.print(ch + "" + c);
			else if (c == 1)
				System.out.print(ch);
		}

	}
}
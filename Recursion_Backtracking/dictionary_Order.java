package Recursion_Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dictionary_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> ans = new ArrayList<String>();
		SmallerThen(str, str, "", ans);
		Collections.sort(ans);
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}

	}

	public static void SmallerThen(String str, String ques, String ans, ArrayList<String> check) {
		if (str.length() == 0) {
			if (ans.compareTo(ques) < 0) {
				check.add(ans);
			}
			
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			String left = str.substring(0, i);
			String right = str.substring(i + 1);

			SmallerThen(left + right, ques, ans + str.charAt(i), check);
		}

	}
}

package Recursion_Backtracking;

public class palindrome_Partionin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String len = "nitin";
		Partition(len, "");

	}

	private static void Partition(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			Partition(ques.substring(i), ans + ques.substring(0, i)+ " | ");
			
		}

	}

}

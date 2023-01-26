package Recursion_Backtracking;

public class nokia_Keypad {

	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

	public static void main(String[] args) {

		String num = "12";
		generateKeypad(num, "");

	}

	private static void generateKeypad(String ques, String ans) {
		
		if(ques.length()==0) {
			System.out.print(ans+ " ");
			return;
		}

		char ch = ques.charAt(0); // 12
		String pressString = key[ch - 48];
		
		for (int i = 0; i < pressString.length(); i++) {  // abc
			
			generateKeypad(ques.substring(1), ans + pressString.charAt(i));
		}
		
		
	}

}

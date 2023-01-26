package Recursion_Backtracking;

public class Board_choice {

	public static void main(String[] args) {

		boolean[] arr = new boolean[4];
		QueenBoard(arr, 2, 0, "",-1);

	}

	private static void QueenBoard(boolean[] arr, int tq, int qpsf, String ans, int idx) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = idx+1; i < arr.length; i++) {
			if (arr[i] == false) {
				arr[i] = true;
				QueenBoard(arr, tq, qpsf + 1, ans + "b" + i + "q" + qpsf + " ",i);		
			} 
			arr[i] = false;
					
		}

	}

}

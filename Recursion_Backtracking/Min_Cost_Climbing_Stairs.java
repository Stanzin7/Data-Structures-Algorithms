package Recursion_Backtracking;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 15, 20 };
		int sum1 = 0;
		int sum2 = 0;

		mincost(arr, 0, 1, sum1, sum2);

	}

	private static void mincost(int[] arr, int i, int j, int sum1, int sum2) {
		
		
		if(i == arr.length || j == arr.length) {
			
			
		}
		
		mincost(arr, i + 1, j + 1, sum1, sum2);
		mincost(arr, i + 2, j + 2, sum1, sum2);

	}

}

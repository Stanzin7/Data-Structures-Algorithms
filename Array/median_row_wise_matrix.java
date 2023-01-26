package Array;

import java.util.ArrayList;
import java.util.Collections;

public class median_row_wise_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat = { { 1, 2, 9 } };

		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[0].length; j++) {
				ans.add(mat[i][j]);

			}
		}
		Collections.sort(ans);
		System.out.println(ans.get(ans.size()/2));

	}

}

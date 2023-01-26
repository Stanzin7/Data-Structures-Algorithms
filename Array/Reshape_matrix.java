package Array;

public class Reshape_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int r = 2;
		int c = 6;
		int rr = 0;
		int cc = 0;

		int[][] n_mat = new int[r][c];

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[0].length; j++) {
				if (cc == c) {
					rr++;
					cc = 0;
				}
				n_mat[rr][cc] = mat[i][j];
				cc++;
			
			}

		}
		for (int i = 0; i < n_mat.length; i++) {
			for (int j = 0; j < n_mat[0].length; j++) {
				System.out.println(n_mat[i][j]);
			}
		}

	}

}

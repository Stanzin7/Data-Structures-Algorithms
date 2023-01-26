package Array;

public class rotate_image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] n_mat = new int[mat.length][mat.length];
		int c = mat.length - 1;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				n_mat[j][c] = mat[i][j];
				

			}
			c--;
		}
		for (int i = 0; i < n_mat.length; i++) {
			for (int j = 0; j < n_mat.length; j++) {
				System.out.print(n_mat[i][j]+ " ");
			}
		}

	}

}

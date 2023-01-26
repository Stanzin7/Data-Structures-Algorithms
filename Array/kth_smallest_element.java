package Array;

public class kth_smallest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat = { { 1, 2 }, { 1, 3 } };
		int k = 2;

		int lo = 0;
		int hi = mat.length * mat[0].length;

		while (lo <= hi) {

			int mid = (lo + hi) / 2; // 4

			if (mid == k) {
				int row = 0;
				int col = 0;
				int i = 1;
				for (int r = 0; r < mid; r++) {
					if (r == mat[0].length * i) {
						row++;
						i++;
						col = 0;

					}
					col++;

				}
				System.out.println(mat[row][col - 1]);
				break;

			} else if (mid > k) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}

	}

}

package Array;

public class Search2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };

		int t = 5;

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				int lo = 0;
				int hi = matrix[0].length;
				while (lo <= hi) {
					int mid = (lo + hi) / 2;
					if (matrix[j][mid] == t) {
						System.out.println(true);
						break;
					} else if (matrix[j][mid] > t) {
						hi = mid - 1;
					} else {
						lo = mid + 1;
					}

				}
			}
		}
		System.out.println(false);

	}

}

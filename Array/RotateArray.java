package Array;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rotate(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

	public static void rotate(int[] arr, int k) {

		k = k % 7;

		for (int j = 0; j <= k; j++) {
			int temp = arr[arr.length - 1];

			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];

			}
			arr[0] = temp;
		}

	}

}

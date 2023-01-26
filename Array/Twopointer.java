package Array;

public class Twopointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 5, 7, 11, 9 };
		swap(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

	public static void swap(int[] arr) {
		int i = 0;
		int hi = arr.length - 1;

		while (i < hi) {
			int temp = arr[i];
			arr[i] = arr[hi];
			arr[hi] = temp;

			i++;
			hi--;
		}

	}

}

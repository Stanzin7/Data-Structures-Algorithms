package Array;

public class SelectionSort {

	public static void main(String[] args) {
		// Index based swapping

		int[] arr = { 1, 3, 2, 7, 9, 14 };

		for (int i = 0; i < arr.length; i++) {
			int idx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[idx]) {
					idx = j;
				}

			}
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	

}

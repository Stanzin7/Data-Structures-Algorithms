package Array;

public class bubbleSortt {
	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 7, 9, 4 };

		for (int turn = arr.length - 1; turn >= 0; turn--) { // 4

			for (int i = 0; i < turn; i++) { // i < 4
				if (arr[i] > arr[i + 1]) {
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}

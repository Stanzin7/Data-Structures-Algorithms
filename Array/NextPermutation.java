package Array;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 2, 7, 4, 3, 1 };

		int j = arr.length - 2;
		int idx = 0;

		while (j >= 0) {

			if (arr[j] < arr[j + 1]) {
				idx = j;
				break;
			}
			j--;

		}
		int q = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > arr[idx]) {
				q = i;
				break;
			}

		}
		int t = arr[idx];
		arr[idx] = arr[q];
		arr[q] = t;

		idx = idx + 1;

		int f = arr.length - 1;

		while (idx < f) {
			int temp = arr[idx];
			arr[idx] = arr[f];
			arr[f] = temp;
			idx++;
			f--;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}

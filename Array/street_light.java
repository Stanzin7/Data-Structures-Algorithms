package Array;

public class street_light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 1, 0, 1, 1, 1, 1 };
		int d = 2;
		int[] temp = new int[arr.length];

		while (d-- > 0) {

			int l = 0, r = 0;
			for (int i = 0; i < arr.length - 1; i++) {

				if (i == 0) {
					if (arr[i + 1] == 0) {
						temp[i] = 0;
					}
					if (arr[i + 1] == 1) {
						temp[i] = 1;
					}
				} else {

					l = arr[i - 1];
					// System.out.println(i+ "--> "+ l);
					if (arr[i + 1] == 0 && arr[i - 1] == 0) {
						temp[i] = 0;
					}
					if (arr[i + 1] == 0 && l == 1) {
						temp[i] = 1;
					}
					if (arr[i + 1] == 1 && l == 0) {
						temp[i] = 1;
					}
					if (arr[i + 1] == 1 && l == 1) {
						temp[i] = 0;
					}
				}
			}
			int la = arr.length - 1;
			if (arr[la - 1] == 1) {
				temp[la] = 1;
			}
			if (arr[la - 1] == 0) {
				temp[la] = 0;
			}
			arr = temp;
			temp = new int[arr.length];

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();


	}

}

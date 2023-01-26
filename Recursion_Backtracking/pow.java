package Recursion_Backtracking;

public class pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 2;
		int n = 9;

		double check = checkPower(x, Math.abs(n));

		if (n < 0) {
			System.out.println(1 / check);
		} else {
			System.out.println(check);
		}

	}

	private static double checkPower(double x, int n) {

		if (n == 0) {
			return 1;
		}

		else if (n % 2 == 0) {
			return  checkPower(x, n / 2) * checkPower(x, n / 2);
		} else {
			
			return x* checkPower(x, n - 1);
		}

	}

}

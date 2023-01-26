package Twopointer;

public class minimum_Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 7472256;
		int t = 6;
		
		System.out.println(checkBeautiful(n, t));

	}

	private static long checkBeautiful(long n, int t) {
		// find count of digit
		if (checksum(n) <= t) {
			return 0;
		} else {
			long cod = countofDigit(n);
			long si = cod + 1;
			long ans = Long.MAX_VALUE;
			
			while (si-- > 1) {
				long num = (long) Math.pow(10, si);

				long mod = (long) (n % Math.pow(10, si)); // 124 // 24 // 4

				long check = Math.abs(num - mod);

				if (checksum(check + n) <= t) {
					ans = check;

				}
				
			}
			return ans;
			
		}
		
	}

	private static long checksum(double d) {
		// TODO Auto-generated method stub

		long sum = 0;

		while (d != 0) {
			sum += d % 10;
			d = d / 10;
		}
		
		return sum;
	}

	private static long countofDigit(long n) {

		int c = 0;
		while (n != 0) {
			n = n / 10;
			c++;
		}
		return c;

	}

}

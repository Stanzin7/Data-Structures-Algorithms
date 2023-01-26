package Array;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String log = "x/../x";
		int ii = 0;
		int count = 0;
		for (int i = 0; i < log.length(); i++) {
			char ch = log.charAt(i);
			if (ch == '/') {
				if (log.substring(ii, i) == "../") {
					if (count == 0) {
						continue;
					}
					count--;
				} else if (log.substring(ii, i) == "./") {
					continue;
				} else if (log.substring(ii, i) == "x") {
					count++;
					continue;
				}
				ii = i;

			}

		}

		if (log.substring(ii, log.length()) == "../") {
			
			count--;
		} else if (log.substring(ii, log.length()) == "/x") {
			count++;

		}

		System.out.println(count);

	}

}

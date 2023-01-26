package Recursion_Backtracking;

import java.util.HashMap;

public class permutation_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abd";
		String s2 = "dcdab";

		// sliding window technique

		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
			} else {
				map.put(s1.charAt(i), 1);
			}
		}

		// check for the window size
		int si = 0;
		int ei = 0;

		int len = 1;
		while (ei < s2.length()) {

			// put elements inside the hashmap
			if (map2.containsKey(s2.charAt(ei))) {
				map2.put(s2.charAt(ei), map2.get(s2.charAt(ei)) + 1);
			} else {
				map2.put(s2.charAt(ei), 1);
			}

			if (len % s1.length() == 0) {
				System.out.println(map2);
				for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
					if (map.equals(map2)) {
						System.out.println(true);
						break;
					}
				}
				
				map2.put(s2.charAt(si), map2.get(s2.charAt(si)) - 1);
				map2.remove(s2.charAt(si), 0);
				si++;
				len--; // reset to 1
			}
			len++;
			ei++;

		}

	}

}

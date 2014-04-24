package solutions.ch17;

import java.util.HashSet;

public class Program_17_12 {
	static void sumK(int[] nums, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			if (!set.contains(i)) {
				if (set.contains(sum - i))
					System.out.println("(" + i + ", " + (sum - i) + ")");
				set.add(i);
			}
		}
	}

	public static void main(String[] args) {
		sumK(new int[] { 10, 10, 2, 3, 4, 6, 8, -10, 20, -10, 0, 0 }, 10);
	}
}

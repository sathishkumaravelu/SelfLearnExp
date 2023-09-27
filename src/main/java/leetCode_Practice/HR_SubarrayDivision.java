package leetCode_Practice;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HR_SubarrayDivision {
	/*
	 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
	 */

	@Test
	public void validData() {
		List<Integer> s = new ArrayList<Integer>();
		s.add(2);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);

		int birthday = birthday_(s, 4, 2);
		Assert.assertEquals(birthday, 2);
	}

	public int birthday(int[] s, int d, int m) {
		int left = 0, pointer = m;
		int sum = 0, count = 0;
		while (left <= pointer-1) {
			sum += s[left++];
		}
		if (sum == d)
			count++;
		while (left < s.length) {
			
			sum += s[left++] - s[left - pointer];
			pointer++;
			if (sum == d)
				count++;
		}

		return count;
	}

	public static int birthday_(List<Integer> s, int d, int m) {
		// Write your code here
		int left = 0, pointer = m;
		int sum = 0, count = 0;
		while (left < pointer) {
			sum += s.get(left++);
		}
		if(sum==d)count++;
		while (left < s.size()) {
			sum += s.get(left) - s.get(left - pointer);
			left++;
			if (sum == d)
				count++;
		}
		return count;

	}

}

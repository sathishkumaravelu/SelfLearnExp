package learn_DSA.bigONotation.timeComplexity;

import org.testng.annotations.Test;

public class BON_02_LogarithmicTime {

	@Test
	public void logarithmicTime() {

		System.out.println(learnLogarithmicTime(10));
	}

	public int learnLogarithmicTime(int n) {
		int count = 1;
		while (n > 0) {
			n /= 2;
			count++;
		}

		return count;
	}

}

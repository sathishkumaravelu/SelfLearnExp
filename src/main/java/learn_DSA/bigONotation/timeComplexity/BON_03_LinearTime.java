package learn_DSA.bigONotation.timeComplexity;

import org.testng.annotations.Test;

public class BON_03_LinearTime {

	@Test
	public void logarithmicTime() {

		learnLinearTime(100);
	}

	public void learnLinearTime(int n) {
		for (int i = 0; i <=n; i++) {
			System.out.println(i);
		}
	}

}

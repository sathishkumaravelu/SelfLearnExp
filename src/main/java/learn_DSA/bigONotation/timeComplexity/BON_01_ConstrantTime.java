package learn_DSA.bigONotation.timeComplexity;

import java.util.Iterator;

import org.testng.annotations.Test;

public class BON_01_ConstrantTime {

	/*
	 * Constant Time: its represented as O(1) - Operation takes the same time
	 * regardless of the input
	 * 
	 */

	@Test
	public void constrantTime() {
		printValue(20000);
	}

	@Test
	public void constrantTimeWithDifferentInput() {
		printValueForLoop(10000);
	}

	public void printValue(int n) {
		System.out.println(n);
	}

	// O(1)

	/**
	 * 
	 * The time complexity of the given program is O(1), which is also known as
	 * constant time complexity. This is because the printValueForLoop method is
	 * called with a constant value (n = 10000) and regardless of the value of n,
	 * the loop inside the printValueForLoop method always iterates a fixed number
	 * of times (3 times in this case).
	 * 
	 * Since the loop iterates a constant number of times regardless of the input
	 * size, the time taken by the loop is not dependent on the input size. As a
	 * result, the overall time complexity of the program remains constant, i.e.,
	 * O(1).
	 * 
	 * @param n
	 */
	public void printValueForLoop(int n) {
		for (int i = 0; i < 3; i++) {
			System.out.println(n);
		}
	}

}

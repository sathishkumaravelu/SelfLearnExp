package leetCode_Practice;

import org.testng.annotations.Test;

public class ArithmeticProgression {

	/*
	 http://tutorialhorizon.com/algorithms/find-the-arithmetic-progression-sequence/ 
	 */
	
	@Test
	public void testData() {
		
		String arithmeticProgressionOutput = arithmeticProgression(01,3,10);
		System.out.println(arithmeticProgressionOutput);
	}
	
	
	public String arithmeticProgression(int a, int diff, int n) {
		
		StringBuilder str = new StringBuilder();
		for(int i = 1;i<=n;i++) {
			int temp = a + (i-1)*diff;
			str.append(temp+" ");
		}
		return str.toString();
		
	}
}

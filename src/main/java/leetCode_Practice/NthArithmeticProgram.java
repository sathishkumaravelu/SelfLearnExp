package leetCode_Practice;

import org.testng.annotations.Test;

public class NthArithmeticProgram {

	@Test
	public void testData() {
		int arithmeticProgressionOutput = nthArithmeticProgression(01,2,5);
		System.out.println(arithmeticProgressionOutput);
	}
	
	
	public int nthArithmeticProgression(int a, int diff, int n) {
		
		int temp =0;
		for(int i = 1;i<=n;i++) {
			temp = a + (i-1)*diff;

		}
		return temp;
		
	}
	
	
}

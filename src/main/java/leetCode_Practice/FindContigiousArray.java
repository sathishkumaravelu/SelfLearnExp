package leetCode_Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class FindContigiousArray {

	@Test
	public void testData() {
		int[] findContigiousArray = findContigiousArray(new int[] {1,4,0,0,3,1,5},3);
		System.out.println(Arrays.toString(findContigiousArray));
	}
	
	
	public int[] findContigiousArray(int[] values, int target) {
		int left = 0, right = 0, currentSum = 0;
		int start = 0, end = 0;
		while(right<values.length) {
			
			if(currentSum<target) {
				currentSum += values[right];
				right++;
			}else if(currentSum>target) {
				left = right;
				right++;
				currentSum=0;
			}else {
				start = left;
				end = right;
				break;
			}
			
		}
		int windowSize= end-start;
		int[] output = new int[windowSize];
		for(int i = 0; i<windowSize;i++) {
			output[i]= values[start++];
		}
		
		return output;
		
		
	}
}

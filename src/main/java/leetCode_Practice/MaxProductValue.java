package leetCode_Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MaxProductValue {

	@Test
	public void testData() {
		int[] maxProduct = maxProduct(new int[] {3,4,1,6,9,7,9,4});
		System.out.println(Arrays.toString(maxProduct));
	}
	
	public int[] maxProduct_(int[] values) {		
		Arrays.sort(values);
		int[] output = new int[3];
		int j = 2;
		for(int i = values.length-1;i>=values.length-3;i--) {
			output[j]= values[i];
			j--;
		}
		return output;
	}
	
	public int[] maxProduct(int[] values) {
	    int firstlargest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;
	    int thirdLargest = Integer.MIN_VALUE;

	    for (int value : values) {
	        if (value > firstlargest) {
	            thirdLargest = secondLargest;
	            secondLargest = firstlargest;
	            firstlargest = value;
	        } else if (value > secondLargest && value != firstlargest) {
	            thirdLargest = secondLargest;
	            secondLargest = value;
	        } else if (value > thirdLargest && value != secondLargest && value != firstlargest) {
	            thirdLargest = value;
	        }
	    }

	    return new int[]{firstlargest, secondLargest, thirdLargest};
	}
	
	
}

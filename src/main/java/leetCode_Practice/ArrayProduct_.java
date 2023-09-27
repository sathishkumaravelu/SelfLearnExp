package leetCode_Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArrayProduct_ {

	
	@Test
	public void testData() {
		int[] maxProduct = arrayProduct(new int[] {1,2,4,3});
		System.out.println(Arrays.toString(maxProduct));
		
		int[] maxProduct1 = arrayProduct(new int[] {0,2,3});
		System.out.println(Arrays.toString(maxProduct1));
		
		int[] maxProduct2 = arrayProduct(new int[] {0,0,3});
		System.out.println(Arrays.toString(maxProduct2));
	}

	private int[] arrayProduct_(int[] values) {
		int left = 0, pointer = values.length;
		int totalValue = 1;
		int[] output = new int[pointer];
		while(left<pointer) {
			totalValue*=values[left++];
		}	
		left = 0;
		while (left<pointer) {
			output[left]= totalValue/values[left++];
		}
		return output;
	}
	
	private int[] arrayProduct(int[] values) {
	    int pointer = values.length;
	    int totalProduct = 1;
	    int zeroCount = 0;
	    for (int value : values) {
	        if (value != 0) totalProduct *= value;
	        else zeroCount++;
	    }

	    int[] output = new int[pointer];

	    for (int i = 0; i < pointer; i++) {
	        if (zeroCount == 0) output[i] = totalProduct / values[i];
	        else if (zeroCount == 1 && values[i] == 0) output[i] = totalProduct;
	        else output[i] = 0;
	    }
	    return output;
	}
	
}

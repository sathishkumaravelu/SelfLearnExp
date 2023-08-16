package javaPrograms;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode_ContainsDuplicate {

	/*
	 * Problem : Given an integer array nums, return true if any value appears at
	 * least twice in the array, and return false if every element is distinct.
	 * 
	 * 1.Understanding
	 * 		input  - int []
	 * 		output - boolean
	 * 		constrain : if any value appears twice, 
	 * 2. Frame Test data
	 * 		[1,3,4,6,3,3]  -- True 
	 * 		[1,3,4,6]  -- False
	 * 		[-1,-1,0]  -- True
	 * 3. Do you know the Solution?  - Yes 
	 * 4. Do you have any alternate approaches? (Thing of alternate approaches)  - No
	 * 5. Psuedo Code:
	 * 			//1,3,3,3,4,6
	 * 		a.) Sort the given array
	 * 		b.) iterate thru the length and get the first element to check rest
	 * 			- iterate thru the length to compare the next elements, 
	 * 			  if value is duplicated return true else false
	 * 6. Dry run the pseudo code -- done 
	 * 7.Write the code on notepad
	 * 
	 * public void containsDuplicate(int[] input){
	 * 
	 * Arrays.sort(input);
	 * 
	 * for(int i=0;i<=input.length;i++){
	 * 		for(int j=i+1;j<=input.length-1;j++){
	 * 		if(input[i] == input[j]){
	 * 			return true;
	 * }
	 * }
	 * }
	 * return false;
	 * }
	 * 
	 */	
	@Test
	public void validTest() {
		Assert.assertEquals(true, checkDuplicate(new int[] {1,3,4,6,3,3}));
	}
	@Test
	public void invalidTest() {
		Assert.assertEquals(false, checkDuplicate(new int[] {1,3,4,6}));
	}
	@Test
	public void edgeTest() {
		Assert.assertEquals(true, checkDuplicate(new int[] {-1,-1,0,1,1}));
	}
	
	
	public boolean checkDuplicate(int[] input) {
		Arrays.sort(input);

		for(int i=0;i<=input.length;i++){
				for(int j=i+1;j<=input.length-1;j++){
				if(input[i] == input[j]){
					return true;
		}
		}
		}
		return false;
		}
	}

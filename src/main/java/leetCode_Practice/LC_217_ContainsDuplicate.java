package leetCode_Practice;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC_217_ContainsDuplicate {

	/*
	 Problem statement:
	 https://leetcode.com/problems/contains-duplicate/description/
	 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
	 
	  1. Understanding the problem - Yes
	  	input - int num [] 
	  	output - boolean true or false
	  2. Test Data - 2 Mins
	  3. Do you know the solution - Yes
	  4. Do you have the best approach - yes
	  5. Pseudo code 
	  
	 */
	
	
	//Test Data
	@Test
	public void validData() {
		int nums[]= {1,2,3,4,6,1};
		boolean isDuplicate= containsDuplicate(nums);
		Assert.assertEquals(isDuplicate, true);
	}
	@Test
	public void invalidData() {
		int nums[]= {1,2,3,4,6};
		boolean isDuplicate= containsDuplicate(nums);
		Assert.assertEquals(isDuplicate, true);
	}
	@Test
	public void edgeData() {
		int nums[]= {1,1,2,2,3,4,6};
		boolean isDuplicate= containsDuplicate(nums);
		Assert.assertEquals(isDuplicate, true);
	}

	private boolean containsDuplicate(int[] nums) {

		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if(i==nums.length) {
				return true;
			}else if (nums[i] == nums[i + 1]) {
				return true;
			} 
		}
		return false;
	}
	
	//Pseudo code
	//1. sort the given array
	//2. iterate the loop to the length 
	//3. check if next element is duplicate
	//4. return false
	
	/*
	 Arrays.sort(nums);
	 for(int i=0;i<=nums.length;i++){
	 if(nums[i]!=nums[i+1] || nums[i]==nums.length())
	 {
	 
	 }else return false;
	 return true;
 		}
	 */
	
}

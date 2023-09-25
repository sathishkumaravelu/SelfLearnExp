package leetCode_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HR_RepeatedString {

	/*
	 * problem statement :
	  There is a string, , of lowercase English letters that is repeated infinitely many times. Given an 	 	         	  integer, , find and print the number of letter a's in the first  letters of the infinite string.

	  Example
	  The substring we consider is , the first  characters of the infinite string. There are  occurrences of a 	  in the substring.
	  
	  1. understand the problem 
	  input - > String and int n
	  output -> int 
	  2. Test data - 2mins
	  3. do you know the solution - Yes 
	  4. Do you know the alternate approach - No 
	  5. Pesudo code
	  
	  have a rotate int with zero and counter 
	  iterate thru the size of the n 
	  check if the string character has 'a'
	  if it contains keep the counter 
	  increment the rotate 
	  check if rotate == length of the string 
	  then reset it to zero 
	  
	  finally return counter
	  6. Dry run pseudo code
	  7. write code on paper
	  8. dry run on paper
	  9. write it in IDE
	  10. Dry run / debug 
	  
	  int rotate=0, counter =0;
	  for(int i=0;i<n;i++){
	     if(s.charAt(rotate)=='a'){
	     counter++;
	     }
	     rotate++;
	     if(rotate==s.length()){
	     rotate=0;
	     }
	  }
	  
	 * 
	 */
	
	@Test
	public void validData() {
		long count = repeatedString("abcde",10);
		Assert.assertEquals(count, 2);
	}
	
	@Test
	public void validData1() {
		long val = 1000000000000l;
		long count = repeatedString("a",val);
		Assert.assertEquals(count, 1000000000000l);
	}
	

	/*
	 * private int noOfRepeatedString(String s, int n) { int rotate = 0, counter =
	 * 0; for (int i = 0; i < n; i++) { if (s.charAt(rotate) == 'a') { counter++; }
	 * rotate++; if (rotate == s.length()) { rotate = 0; } }
	 * 
	 * return counter; }
	 */	
	
	   public static long repeatedString(String s, long n) {

		   if(s.length()==1) return n;
		   
	        int rotate = 0;
	        long counter = 0;
	        for (int i = 0; i < n; i++) {
	            if (s.charAt(rotate) == 'a') {
	                counter++;
	            }
	            rotate++;
	            if (rotate == s.length()) {
	                rotate = 0;
	            }
	        }

	        return counter;
	    
	    }
	
}

package leetCode_Practice;

import java.util.Arrays;
import java.util.Iterator;

import org.testng.annotations.Test;

public class ReverseEveryWord {

	@Test
	public void testData() {
		String reverseString = reverseString("I Lov!@#$%e My Country");
		System.out.println(reverseString);
	}

	private String reverseString(String str) {
		String[] strArr = str.split(" ");
		String revInput="";
		for (int i = 0; i < strArr.length; i++) {
			// String revInput2 = revInput(strArr[i]);
			 revInput+=" "+revInput(strArr[i]);
		}
		return revInput;		
	}
	public String revInput(String str) {
		if(str.length()==1) return str;
		char[] charArray = str.toCharArray();
		int left = 0, right=charArray.length-1;	
		while(left<right) {
			char temp = charArray[left];
			charArray[left++]=charArray[right];
			charArray[right--]=temp;
			
		}
		return new String(charArray);
	}
}

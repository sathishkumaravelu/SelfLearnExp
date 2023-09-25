package leetCode_Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class FindExtraElement_Array {

	/*
	 	http://tutorialhorizon.com/algorithms/find-an-extra-element-in-two-almost-similar-arrays/
	 */
	
	@Test
	public void validData() {
		/*
		 	arrA = [1, 4, 2, 5, 7] 
		 	arrB = [1, 2, 4, 1, 7, 5]
		 */
		System.out.println(findExtraElement(new int[] {1, 2,2, 4, 10, 7, 5},new int[] {1, 4,2, 2, 5, 7}));
		
	}
	/*
	  Pseudo code
	  
	  1. i can sort both the arrays 
	  2. have two pointers at 0 of each array
	  3. iterate till the length of contingious array
	  4. check each element, if the element not matches return that not matching value as output
	  
	 */
	
	
	public int findExtraElement_1(int[] contiguousArr, int[] normalArr) {
		int contiguousStart = 0, normalStart = 0;
		Arrays.sort(contiguousArr);
		Arrays.sort(normalArr);
		
		while(contiguousStart<contiguousArr.length-1) {
			if(contiguousArr[contiguousStart]!= normalArr[normalStart]) return contiguousArr[contiguousStart];
			else {
				contiguousStart++;
				normalStart++;
			}
		}
		if(contiguousStart==contiguousArr.length-1) {
			return contiguousArr[contiguousStart];
		}else return -1;
	}
	
	
	   public int findExtraElement_2(int [] arrA, int [] arrB){

	        int extraElement = 0;

	        for (int i = 0; i <arrA.length ; i++)
	            extraElement ^= arrA[i];

	        for (int i = 0; i <arrB.length ; i++)
	            extraElement ^= arrB[i];

	        System.out.println("Array A: " + Arrays.toString(arrA));
	        System.out.println("Array B: " + Arrays.toString(arrB));
	        System.out.println("Extra Element: " + extraElement);
			return extraElement;
	    }


	   public int findExtraElement(int [] arrA, int [] arrB){

	        int sum = 0;

	        for (int i = 0; i <arrA.length ; i++)
	            sum += arrA[i];

	        for (int i = 0; i <arrB.length ; i++)
	            sum -= arrB[i];

	        System.out.println("Array A: " + Arrays.toString(arrA));
	        System.out.println("Array B: " + Arrays.toString(arrB));
	        System.out.println("Extra Element: " + sum);
			return sum;
	    }

	
}

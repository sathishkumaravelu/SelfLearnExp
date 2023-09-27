package leetCode_Practice;

import java.util.Arrays;
import java.util.HashMap;

import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;

public class ArrayRank {

	/*
	  	https://tutorialhorizon.com/algorithms/given-an-array-rank-its-elements/
	  	
	 */
	
	//Pesudo code
	// create a temp array and copy the value 
	// sort the array in the temp 
	// add the temp array to a hashMap
	// now have two pointers left and right to zero and length of the array
	// iterate till the right 
	// get the value from the map and replace with the key 
	
	
	@Test
	public void validData() {
		
		int[] arrayRank = arrayRank(new int[] {22,11,44,55,12});
		System.out.println(Arrays.toString(arrayRank));
	}
	
	public int[] arrayRank(int[] arr) {
		
		 int [] temp = Arrays.copyOfRange(arr, 0, arr.length);		
		Arrays.sort(temp);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<temp.length;i++) {
			if(!(map.containsKey(temp[i]))){
				map.put(temp[i], i+1);
			}
		}
		/*
		 * System.out.println(map); for(int i=0; i<arr.length; i++) if
		 * (map.containsKey(arr[i])) { temp[i] = map.get(arr[i]); }
		 */

		int left = 0, right = arr.length - 1;
		while (left < right) {
			arr[left] = map.get(arr[left]);
			arr[right] = map.get(arr[right]);
			left++;
			right--;
		}

		return arr;
	}

}

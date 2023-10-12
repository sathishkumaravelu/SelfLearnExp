package leetCode_Practice;

import org.testng.annotations.Test;

import java.util.Arrays;

public class moveNonZeros {

    @Test
    public void testData() {
        System.out.println(Arrays.toString(moveZeroes1(new int[]{1, 0, 1, 0, 12})));
    }

    //Pseudo code:
    /*
        1. create an new array (result) with input size
        2. fill the values to zero
        3. keep a index variable as zero
        4. iterate thru the input array, if the value is not zero
            assign the value to the from the start of the index and increment the index
     */
    public int[] moveZeroes(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result,0);
        int index =0;
        for (int num : nums) {
            if (num != 0) {
                result[index] = num;
                index++;
            }
        }
        return  result;
    }

    public int[] moveZeroes1(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != index) {
                    // Swap non-zero element with the element at the current index
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                }
                index++;
            }
        }
        return nums;
    }
}

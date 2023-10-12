package leetCode_Practice;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class MaxProduct {

    @Test
    public void testData() {
        int outputProduct = maxProduct(new int[]{0, 2});
        System.out.println(outputProduct);
    }

    public int maxProduct(int[] input) {
        int start = 0, fast = 0;
        int currentProduct = input[start];
        int maxProduct = Integer.MIN_VALUE;
        while (start < input.length) {

            currentProduct *= input[start++];
            if (currentProduct == 0) {
                maxProduct = Math.max(maxProduct, currentProduct);
            }

        }
        return maxProduct;
    }


    @Test
    public void validData() {
        int[] outputProduct = moveZeros(new int[]{0,1,1,0,1,0});
        System.out.println(Arrays.toString(outputProduct));
    }

    public int[] moveZeros(int[] input) {

        HashMap<Character,Character> hm = new HashMap<>();
        hm.get("");
        int start = 0, end = start + 1;
        int temp = 0;
        while (end < input.length && start < input.length) {
            if (input[start] == 0 && input[end] == 1) {
                temp = input[start];
                input[start] = input[end];
                input[end] = temp;
                start++;
                end++;
            } else if (input[end] == 0 && input[start] == 0) {
                end++;
            } else {
               start++;
               end++;
            }
        }
        return input;
    }
}
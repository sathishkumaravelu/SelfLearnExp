package leetCode_Practice;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;

public class LC349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2)  {
            if (set1.contains(n))
                set2.add(n);
        }
        int[] result = new int[set2.size()];
        int index = 0;
        for (int n : set2) {
            result[index++] = n;
        }
        return result;
    }

    @Test
    public void testData() {
        int[] intersection = intersection(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(intersection));
    }

}

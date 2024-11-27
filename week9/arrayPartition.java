package week9;

import java.util.Arrays;

public class arrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int totalSum = 0;

        for (int i = 0; i < nums.length; i+= 2) {
            totalSum += nums[i];
        }

        return totalSum;
    }
}

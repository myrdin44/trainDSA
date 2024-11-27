package week9;

import java.util.Arrays;

public class missingNumber {
        public int missingNumber(int[] nums) {
        int length = nums.length;

        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}

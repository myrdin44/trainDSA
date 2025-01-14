package week16;

import java.util.Arrays;

public class largestPositiveIntegerThatExsistsWithItsNegative {
    public int findMaxK(int[] nums) {
        int result = -1; //-7,-1,1,6,7,10
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (Math.abs(nums[left]) == Math.abs(nums[right]) && nums[left] + nums[right] == 0) {
                return nums[right];
            } else {
                if ( Math.abs(nums[left]) < Math.abs(nums[right])) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result;


    }
}

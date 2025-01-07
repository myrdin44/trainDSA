package week15;

import java.util.Arrays;

public class minimumDifferrenceBetweenLowestAndHighestOfKScore {
    public int minimumDifference(int[] nums, int k) {
        if (nums.length < 2) {
            return 0;
        }

        int minDifferrence = Integer.MAX_VALUE;
        Arrays.sort(nums); //1,4,7,9

        for (int i = 0; i < nums.length - k + 1; i++) {
            if (nums[i + k - 1] - nums[i] < minDifferrence) {
                minDifferrence = nums[i + k - 1] - nums[i];
            }
        }

        return minDifferrence;

    }
}

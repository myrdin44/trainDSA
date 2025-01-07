package week15;

import java.util.HashMap;

public class findSubArrayWithEqualSum {
    public boolean findSubarrays(int[] nums) {
        int sum [] = new int[nums.length - 1];

        for (int i = 0; i < sum.length; i++) {
            sum[i] = nums[i] + nums[i + 1];
        }

        HashMap<Integer, Integer> countFreqSum = new HashMap<>();

        for (int i = 0; i < sum.length; i++) {
            countFreqSum.put(sum[i], countFreqSum.getOrDefault(sum[i], 0) + 1);
        }

        for (int val : countFreqSum.values()) {
            if (val > 1) {
                return true;
            }
        }

        return false;
    }
}

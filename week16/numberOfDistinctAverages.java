package week16;

import java.util.Arrays;
import java.util.HashSet;

public class numberOfDistinctAverages {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        HashSet<Double> avgs = new HashSet<>();

        while(left < right) {
            double tempAvg = (double)(nums[left] + nums[right]) / 2;
            avgs.add(tempAvg);
            left++;
            right--;
        }

        return avgs.size();
    }
}

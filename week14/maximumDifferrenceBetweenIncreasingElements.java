package week14;

public class maximumDifferrenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int minSoFar = nums[0];
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > minSoFar) {
                maxDiff = Math.max(maxDiff, nums[j] - minSoFar);
            }
            
            minSoFar = Math.min(minSoFar, nums[j]);
        }
        
        return maxDiff;
    }
}

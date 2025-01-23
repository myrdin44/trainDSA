package week17;

import java.util.HashSet;

public class findTheDistinctDifferrenceArray {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];
        
        for (int i = 0; i < n; i++) {
            HashSet<Integer> prefix = new HashSet<>();
            for (int j = 0; j <= i; j++) {
                prefix.add(nums[j]);
            }
            
            HashSet<Integer> suffix = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                suffix.add(nums[j]);
            }
            
            diff[i] = prefix.size() - suffix.size();
        }
        
        return diff;
    }
}

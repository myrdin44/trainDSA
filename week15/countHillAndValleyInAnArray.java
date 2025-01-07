package week15;

public class countHillAndValleyInAnArray {
    public int countHillValley(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i - 1;
            while (left > 0 && nums[left] == nums[i]) {
                left--;
            }
            
            int right = i + 1;
            while (right < n - 1 && nums[right] == nums[i]) {
                right++;
            }
            
            // Check if hill or valley
            if (nums[i] > nums[left] && nums[i] > nums[right]) {
                count++; // Hill
            } else if (nums[i] < nums[left] && nums[i] < nums[right]) {
                count++; // Valley
            }
        }
        
        return count;
     }
}

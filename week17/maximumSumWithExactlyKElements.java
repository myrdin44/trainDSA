package week17;

public class maximumSumWithExactlyKElements {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        
        //max + (max+1) + (max+2) + ... + (max+k-1)
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += max + i;
        }
        
        return sum;
    }
}

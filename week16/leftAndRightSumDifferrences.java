package week16;

public class leftAndRightSumDifferrences {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        if (n == 1) {
            return new int[]{0};
        }
        
        int[] leftSum = new int[n];
        leftSum[0] = 0;
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }
        
        int[] rightSum = new int[n];
        rightSum[n-1] = 0;
        for (int i = n-2; i >= 0; i--) {
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }
        
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        
        return answer;  
    }
}

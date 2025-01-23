package week17;

public class findTheMaximumDivisibilityScore {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxScore = -1;
        int result = Integer.MAX_VALUE;
        
        for (int divisor : divisors) {
            int currentScore = 0;
            
            for (int num : nums) {
                if (num % divisor == 0) {
                    currentScore++;
                }
            }
        
            if (currentScore > maxScore || 
                (currentScore == maxScore && divisor < result)) {
                maxScore = currentScore;
                result = divisor;
            }
        }
        
        return result;
    }
}

package week14;

public class countSpecialQuadruplets {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        if (n < 4) {
            return 0;
        }
        
        //a < b < c < d
        for (int a = 0; a < n - 3; a++) {
            for (int b = a + 1; b < n - 2; b++) {
                for (int c = b + 1; c < n - 1; c++) {
                    //calculate sum
                    int sum = nums[a] + nums[b] + nums[c];
                    
                    for (int d = c + 1; d < n; d++) {
                        if (sum == nums[d]) {
                            count++;
                        }
                    }
                }
            }
        }
        
        return count;
    }
}

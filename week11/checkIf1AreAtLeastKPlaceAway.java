package week11;

public class checkIf1AreAtLeastKPlaceAway {
    public boolean kLengthApart(int[] nums, int k) {
        int lastOnePosition = -k - 1;
        
        for (int i = 0; i < nums.length; i++) {
            // neu tim thay so 1 
            if (nums[i] == 1) {
                if (i - lastOnePosition <= k) {
                    return false;
                }
                lastOnePosition = i;
            }
        }
        
        return true;
    }
}
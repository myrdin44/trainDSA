import java.util.HashSet;
import java.util.Set;

public class smallestMissingIntegerGreaterThanSequentialPrefixSum {
    public int missingInteger(int[] nums) {
        int prefixLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] + 1) {
                prefixLength++;
            } else {
                break;
            }
        }
        
        int prefixSum = 0;
        for (int i = 0; i < prefixLength; i++) {
            prefixSum += nums[i];
        }
        
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int result = prefixSum;
        while (numSet.contains(result)) {
            result++;
        }
        
        return result;
    }
}

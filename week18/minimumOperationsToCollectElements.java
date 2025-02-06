import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class minimumOperationsToCollectElements {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> collected = new HashSet<>();
        
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) <= k && !collected.contains(nums.get(i))) {
                collected.add(nums.get(i));
            }
            
            if (collected.size() == k) {
                return nums.size() - i;
            }
        }
        
        return nums.size();
    }
}

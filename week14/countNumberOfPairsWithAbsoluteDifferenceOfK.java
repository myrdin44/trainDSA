package week14;

import java.util.HashMap;
import java.util.Map;

public class countNumberOfPairsWithAbsoluteDifferenceOfK {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int count = 0;
        
        //count frequency of each number
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        //check for pairs with difference k
        for (int num : nums) {
            //check num + k (larger)
            if (frequency.containsKey(num + k)) {
                count += frequency.get(num + k);
            }
        }
        
        return count;
    }   
}

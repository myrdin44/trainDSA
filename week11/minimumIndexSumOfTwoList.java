package week11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class minimumIndexSumOfTwoList {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> indexMap = new HashMap<>();
        
        for (int i = 0; i < list1.length; i++) {
            indexMap.put(list1[i], i);
        }
        
        int minSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        
        for (int j = 0; j < list2.length; j++) {
            if (indexMap.containsKey(list2[j])) {
                int currentSum = j + indexMap.get(list2[j]);
                
                if (currentSum < minSum) {
                    minSum = currentSum;
                    result.clear();
                    result.add(list2[j]);
                } 
                else if (currentSum == minSum) {
                    result.add(list2[j]);
                }
            }
        }
        
        return result.toArray(new String[0]);
    }
}

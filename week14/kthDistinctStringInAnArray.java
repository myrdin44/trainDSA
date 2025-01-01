package week14;

import java.util.LinkedHashMap;
import java.util.Map;

public class kthDistinctStringInAnArray {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();
        
        for (String str : arr) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
        
        int distinctCount = 0;
        
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                distinctCount++;
                if (distinctCount == k) {
                    return entry.getKey();
                }
            }
        }
        
        return "";
    }
}

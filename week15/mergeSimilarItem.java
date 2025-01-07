package week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mergeSimilarItem {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer, Integer> weight = new HashMap<>();

        for (int[] item : items1) {
            weight.put(item[0], weight.getOrDefault(item[0], 0) + item[1]);
        }
        for (int[] item : items2) {
            weight.put(item[0], weight.getOrDefault(item[0], 0) + item[1]);
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : weight.entrySet()) {
            result.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }
        
        Collections.sort(result, (a, b) -> a.get(0) - b.get(0));
        
        return result;

    }
}

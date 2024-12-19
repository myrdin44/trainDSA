package week12;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class sortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int freqCompare = freqMap.get(a).compareTo(freqMap.get(b));
            if (freqCompare == 0) {
                return Integer.compare(b, a);
            }
            return freqCompare;
        });
        
        for (int num : freqMap.keySet()) {
            pq.offer(num);
        }
        
        int[] result = new int[nums.length];
        int index = 0;
        while (!pq.isEmpty()) {
            int num = pq.poll();
            int freq = freqMap.get(num);
            for (int i = 0; i < freq; i++) {
                result[index++] = num;
            }
        }
        
        return result;
    }
}

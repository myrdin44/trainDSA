package week15;

import java.util.HashMap;

public class mostFrequentEvenElement {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
        }

        int maxFreq = 0;
        int minVal = Integer.MAX_VALUE;
        for (int f : freq.values()) {
            if (f > maxFreq) {
                maxFreq = f;
            }
        }

        for (int num : freq.keySet()) {
            if (freq.get(num) == maxFreq && num < minVal) {
                minVal = num;
            }
        }

        if (freq.size() == 0) {
            return -1;
        }

        return minVal;

    }
}

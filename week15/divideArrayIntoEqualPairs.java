package week15;

import java.util.HashMap;

public class divideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int val : freq.values()) {
            if (val % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
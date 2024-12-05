package week10;

import java.util.HashMap;

public class degreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        HashMap<Integer, Integer> firstIndex = new HashMap<>();
        HashMap<Integer, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            if (!firstIndex.containsKey(num)) {
                firstIndex.put(num, i);
            }
            lastIndex.put(num, i);
        }

        // tim bac cua mang
        int degree = 0;
        for (int freq : frequency.values()) {
            degree = Math.max(degree, freq);
        }

        // tim mang con nho nhat cung bac
        int minLength = Integer.MAX_VALUE;
        for (int num : frequency.keySet()) {
            if (frequency.get(num) == degree) {
                int length = lastIndex.get(num) - firstIndex.get(num) + 1;
                minLength = Math.min(minLength, length);
            }
        }

        return minLength;
    }
}

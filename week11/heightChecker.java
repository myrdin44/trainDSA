package week11;

import java.util.Arrays;

public class heightChecker {
    public int heightChecker(int[] heights) {
        int clone [] = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            clone[i] = heights[i];
        }
        Arrays.sort(clone);
        
        int countDiff = 0;

        for (int k = 0; k < heights.length; k++) {
            if (clone[k] != heights[k]) {
                countDiff++;
            }
        }

        return countDiff;
    }
}

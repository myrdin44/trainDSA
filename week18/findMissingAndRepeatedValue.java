public class findMissingAndRepeatedValue {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] count = new int[n * n + 1];
        
        for (int[] row : grid) {
            for (int num : row) {
                count[num]++;
            }
        }
        
        int repeating = 0, missing = 0;
        for (int i = 1; i <= n * n; i++) {
            if (count[i] == 2) repeating = i;
            if (count[i] == 0) missing = i;
        }
        
        return new int[]{repeating, missing};
    }
}

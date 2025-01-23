package week17;

public class findTheWidthOfColumnsOfAGrid {
    public int[] findColumnWidth(int[][] grid) {
        int size = grid.length;

        int ans [] = new int[grid[0].length];

        for(int i = 0; i < grid[0].length; i++) {
            ans[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (String.valueOf(grid[i][j]).length() > ans[j]) {
                    ans[j] = String.valueOf(grid[i][j]).length();
                }
            }
        }

        return ans;
    }
}

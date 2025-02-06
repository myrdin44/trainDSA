public class maximumNumberOfFishInTheGrid {
    private int m, n;
    private int[][] grid;
    private boolean[][] visited;
    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int findMaxFish(int[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        
        int maxFish = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    visited = new boolean[m][n]; 
                    maxFish = Math.max(maxFish, dfs(i, j));
                }
            }
        }
        
        return maxFish;
    }

    private int dfs(int row, int col) {
        if (row < 0 || row >= m || col < 0 || col >= n || 
            visited[row][col] ||                          
            grid[row][col] == 0) {                       
            return 0;
        }
        
        visited[row][col] = true;
        int currentFish = grid[row][col];
        
        for (int[] dir : DIRECTIONS) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            currentFish += dfs(newRow, newCol);
        }
        
        return currentFish;
    }
}

package week14;

public class convert1DArrayInto2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // Check if the total number of elements matches m * n
        if (original.length != m * n) {
            return new int[0][0];
        }

        //create 2D array
        int[][] result = new int[m][n];

        //fill 2D array with elements from the original array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[i * n + j];
            }
        }

        return result;     
    }
}

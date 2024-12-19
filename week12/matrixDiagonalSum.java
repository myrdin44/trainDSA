package week12;

public class matrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            
            sum += mat[i][n - 1 - i];
        }

        if (n % 2 != 0) {
            int mid = n / 2;
            sum -= mat[mid][mid];
        }

        return sum;
    }
}

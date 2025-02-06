public class modifyTheMatrix {
    public int[][] modifiedMatrix(int[][] matrix) {
        int init [] = new int[matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            init[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > init[j]) {
                    init[j] = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = init[j];
                }
            }
        }

        return matrix;
    }
}

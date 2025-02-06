public class matrixSimilarityAfterCyclicShifs {
    public boolean areSimilar(int[][] mat, int k) {
        int[][] original = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            original[i] = mat[i].clone();
        }
        
        for (int step = 0; step < k; step++) {
            for (int i = 0; i < mat.length; i += 2) {
                shiftRowLeft(mat[i]);
            }
            
            for (int i = 1; i < mat.length; i += 2) {
                shiftRowRight(mat[i]);
            }
        }
        
        return isMatrixEqual(mat, original);
    }

    //to shift a row left cyclically
    private void shiftRowLeft(int[] row) {
        int first = row[0];
        for (int i = 0; i < row.length - 1; i++) {
            row[i] = row[i + 1];
        }
        row[row.length - 1] = first;
    }
    
    //to shift a row right cyclically
    private void shiftRowRight(int[] row) {
        int last = row[row.length - 1];
        for (int i = row.length - 1; i > 0; i--) {
            row[i] = row[i - 1];
        }
        row[0] = last;
    }
    
    //to check matrix equality
    private boolean isMatrixEqual(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

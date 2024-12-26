package week13;

public class determineWhetherMatrixCanBeObtainedByRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target)) {
                return true;
            }
            mat = rotate90(mat);
        }
        return false;
    }

    public int[][] rotate90(int[][] mat) {
        int size = mat.length;
        int [][] rotate = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotate[j][size-1-i] = mat[i][j];
            }
        }

        return rotate;
    }

    public boolean isEqual(int [][] mat1, int [][] mat2) {
        int size = mat1.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

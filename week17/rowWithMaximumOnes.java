package week17;

public class rowWithMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxCount = 0;
        int rowIndex = 0;
        
        for (int i = 0; i < mat.length; i++) {
            int currentCount = 0;
            
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    currentCount++;
                }
            }
            
            if (currentCount > maxCount) {
                maxCount = currentCount;
                rowIndex = i;
            }
        }
        
        return new int[]{rowIndex, maxCount};
    }
}

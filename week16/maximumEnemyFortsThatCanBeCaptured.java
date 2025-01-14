package week16;

public class maximumEnemyFortsThatCanBeCaptured {
    public int captureForts(int[] forts) {
        int n = forts.length;
        int maxCapture = 0;
        
        for (int i = 0; i < n; i++) {
            if (forts[i] == 1) {
                for (int j = i + 1; j < n; j++) {
                    if (forts[j] != 0) {
                        if (forts[j] == -1) {
                            int enemyCount = j - i - 1;
                            maxCapture = Math.max(maxCapture, enemyCount);
                        }
                        break;
                    }
                }
            }
            else if (forts[i] == -1) {
                for (int j = i + 1; j < n; j++) {
                    if (forts[j] != 0) {
                        if (forts[j] == 1) {
                            int enemyCount = j - i - 1;
                            maxCapture = Math.max(maxCapture, enemyCount);
                        }
                        break;
                    }
                }
            }
        }
        
        return maxCapture;
    }
}

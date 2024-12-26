package week13;

public class findNUniqueIntegerSumUpToZero {
    public int[] sumZero(int n) {
        int result [] = new int[n];
        int index = 0;

        if (n % 2 == 0) {
            for (int i = 1; i <= n/2; i++) {
                result[index++] = i;
                result[index++] = -i;
            }
        } else {
            for (int i = 1; i <= n/2; i++) {
                result[index++] = i;
                result[index++] = -i;
            }
            result[index] = 0;
        }

        return result;
    }
}

public class minimumOperationsToExceedThresholdValue {
    public int minOperations(int[] nums, int k) {
        int countLess = 0;
        for (int num : nums) {
            if (num < k) {
                countLess++;
            }
        }

        return countLess;
    }
}

package week12;

public class maximumProductOf2ElementsOfAnArray {
    public int maxProduct(int[] nums) {
        int maxVal = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    int product = (nums[i] - 1) * (nums[j] - 1);
                    maxVal = Math.max(maxVal, product);
                }
            }
        }
        return maxVal;
    }
}

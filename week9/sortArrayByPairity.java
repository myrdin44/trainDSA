package week9;

public class sortArrayByPairity {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        int result [] = new int[nums.length];

        while (leftIndex < rightIndex) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    result[leftIndex++] = nums[i];
                } else {
                    result[rightIndex--] = nums[i];
                }
            }
        }

        return result;
    }
}

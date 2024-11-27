package week9;

public class moveZeros {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
            i++;
        }

        for (int k = index; k < nums.length; k++) {
            nums[k] = 0;
        }
    }
}

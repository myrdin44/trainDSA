package week15;

public class findClosetNumberToZero {
    public int findClosestNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int closet = nums[0];

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closet)) {
                closet = num;
            } else if (Math.abs(num) == Math.abs(closet)) {
                closet = (num > closet) ? num : closet;
            }
        }

        return closet;
    }
}

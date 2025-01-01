package week14;

public class maximumProductDifferrenceBetweenTwoPairs {
    public int maxProductDifference(int[] nums) {
        int max = 0;
        int secondMax = 0;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        if (nums.length < 4) {
            return 0;
        }

        //find max, second max, min second min
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] >= max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax && nums[i] < max) {
                secondMax = nums[i];
            }

            if (nums[i] <= min) {
                secondMin = min;
                min = nums[i];
            } else if (nums[i] < secondMin && nums[i] > min) {
                secondMin = nums[i];
            }
        }

        return (max*secondMax) - (min*secondMin);
    }
}

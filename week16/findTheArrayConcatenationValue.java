package week16;

public class findTheArrayConcatenationValue {
    public long findTheArrayConcVal(int[] nums) {
        long concatVal = 0;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (left == right) {
                concatVal += (long)nums[left];
                break;
            }
            concatVal += Long.parseLong(String.valueOf(nums[left]) + String.valueOf(nums[right]));
            left++;
            right--;
            System.out.println(concatVal);
        }

        return concatVal;
    }
}

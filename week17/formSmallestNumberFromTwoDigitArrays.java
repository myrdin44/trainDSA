package week17;

public class formSmallestNumberFromTwoDigitArrays {
    public int minNumber(int[] nums1, int[] nums2) {
        int minCommon = 10;
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    minCommon = Math.min(minCommon, num1);
                }
            }
        }
        
        if (minCommon != 10) {
            return minCommon;
        }
        
        int min1 = 10;
        int min2 = 10;
        for (int num : nums1) {
            min1 = Math.min(min1, num);
        }
        for (int num : nums2) {
            min2 = Math.min(min2, num);
        }
        
        return Math.min(min1 * 10 + min2, min2 * 10 + min1);
    }
}

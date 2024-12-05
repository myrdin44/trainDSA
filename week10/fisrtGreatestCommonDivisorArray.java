package week10;

public class fisrtGreatestCommonDivisorArray {
    public int findGCD(int[] nums) {
        int max = 0;
        int min =Integer.MAX_VALUE;

        for (int ele :nums) {
            if (ele > max) {
                max = ele;
            }
            if (ele < min) {
                min = ele;
            }
        }

        while (min != 0) {
            int temp = max;
            max = min;
            min = temp % min;
        }

        return max;
    }
}

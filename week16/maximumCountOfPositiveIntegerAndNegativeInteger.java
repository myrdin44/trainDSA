package week16;

public class maximumCountOfPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {
        int countPos = 0;
        int countNeg = 0;

        for (int num : nums) {
            countPos += (num > 0) ? 1: 0;
            countNeg += (num < 0) ? 1 :0;
        }

        return (countPos >= countNeg) ? countPos : countNeg;

    }
}

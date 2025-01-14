package week16;

public class differrenceBetweenElementSumAndDigitsSumOfAnArray {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int num : nums) {
            elementSum += num;
            while (num > 0) {
                int remain = num % 10;
                digitSum += remain;
                num /= 10;
            }
        }

        return Math.abs(elementSum - digitSum);
    }
}

package week16;

public class averageValueOfEvenNumberThatDivisibleByThree {
    public int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;

        for (int num : nums) {
            if (num % 3 == 0 && num % 2 == 0) {
                count++;
                sum += num;
            }
        }

        if (count == 0) {return 0;}
        return sum / count;
    }
}

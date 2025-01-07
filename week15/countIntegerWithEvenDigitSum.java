package week15;

public class countIntegerWithEvenDigitSum {
    public int countEven(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (sumDigit(i) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public int sumDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}

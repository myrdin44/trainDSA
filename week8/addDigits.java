package week8;

public class addDigits {
    public int addDigits(int num) {
        while (num > 9) {
            int clone = num;
            int getSum = 0;
            while (clone > 0) {
                int r = clone % 10;
                getSum += r;
                clone /= 10;
            }
            num = getSum;
        }
        return num;
    }
}

package week16;

public class numberOfCommonFactors {
    public int commonFactors(int a, int b) {
        int min = (a > b) ? b : a;
        int count = 1;
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }

        return count;
    }
}

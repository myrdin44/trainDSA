package week16;

public class smallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        if (n <= 2) {
            return 2;
        }

        if (n % 2 == 0) {
            return n;
        }

        return n * 2;
    }
}
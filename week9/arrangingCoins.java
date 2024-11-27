package week9;

public class arrangingCoins {
    public int arrangeCoins(int n) {
        int cap = 1;
        int count = 0;
        while (n >= cap) {
            count++;
            n -= cap;
            cap++;
        }

        return count;
    }
}

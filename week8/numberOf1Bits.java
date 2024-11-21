package week8;

public class numberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;

        while (n > 0) {
            count += n & 1; // Add 1 if the last bit is 1
            n >>= 1;        // Right shift the number
        }

        return count;
    }
}

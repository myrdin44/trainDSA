
import java.util.List;

public class sumOfValuesAtIndiceWithKSetBits {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (isSetBitOfK(i, k)) {
                sum += nums.get(i);
            }
        }
        return sum;
    }

    private boolean isSetBitOfK(int num, int kSet) {
        String binary = intToBinary(num);
        int countSetBit = 0;
        for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                countSetBit++;
            }
        }

        return countSetBit == kSet;
    }

    private String intToBinary(int n) {
        if (n == 0) return "0";
        
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n /= 2;
        }
        return binary.toString();
    }
}

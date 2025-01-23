package week17;

public class checkIfTheNumberIsFascinating {
    public boolean isFascinating(int n) {
        int twoTimesN = 2 * n;
        int threeTimesN = 3 * n;

        String concat = String.valueOf(n) + String.valueOf(twoTimesN) + String.valueOf(threeTimesN);

        System.out.println(concat);
        return isFascinating(concat);
    }

    private boolean isFascinating(String num) {
        boolean[] digits = new boolean[10];
        
        for (char ch : num.toCharArray()) {
            int digit = ch - '0';
            if (digit == 0) continue;
            if (digit < 1 || digit > 9) return false;
            if (digits[digit]) return false;
            digits[digit] = true;
        }
        
        for (int i = 1; i <= 9; i++) {
            if (!digits[i]) return false;
        }
        
        return true;
    }
}

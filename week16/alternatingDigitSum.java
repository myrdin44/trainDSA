package week16;

public class alternatingDigitSum {
    public int alternateDigitSum(int n) {
        String num = String.valueOf(n);
        int sum = 0;
        
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sum += (i % 2 == 0) ? digit : -digit;
        }
        
        return sum;
    }
}

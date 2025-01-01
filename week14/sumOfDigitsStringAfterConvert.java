package week14;

public class sumOfDigitsStringAfterConvert {
    public int getLucky(String s, int k) {
        StringBuilder convert = new StringBuilder();

        for (char ch : s.toCharArray()) {
            convert.append(ch - 96);
        }

        String numStr = convert.toString();
        int sum = 0;
        for (char ch : numStr.toCharArray()) {
            sum += ch - '0';
        }
        
        for (int i = 1; i < k; i++) {
            sum = sumDigit(sum);
        }
        
        return sum;
    }

    private int sumDigit(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n/= 10;
        }

        return sum;
    }
}

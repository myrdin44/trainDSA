package week13;

public class secondLargestInAString {
    public int secondHighest(String s) {
        int first = -1;
        int second = -1;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                if (digit > first) {
                    second = first;
                    first = digit;
                } else if (digit > second && digit < first) {
                    second = digit;
                }
            }
        }

        return second;
    }
}

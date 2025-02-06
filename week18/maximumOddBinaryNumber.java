public class maximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int countOnes = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                countOnes++;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countOnes - 1; i++) {
            result.append('1');
        }
        
        for (int i = 0; i < s.length() - countOnes; i++) {
            result.append('0');
        }
        
        result.append('1');

        return result.toString();
    }
}
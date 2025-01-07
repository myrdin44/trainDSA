package week15;

public class checkIfNumberHasEqualDigitCountAndDigitValue {
    public boolean digitCount(String num) {
        int[] freq = new int[10];
        
        // Count frequency of each digit
        for (char c : num.toCharArray()) {
            freq[c - '0']++;
        }
        
        // Check if each index i occurs num[i] times
        for (int i = 0; i < num.length(); i++) {
            if (freq[i] != (num.charAt(i) - '0')) {
                return false;
            }
        }
        
        return true;
     }
}

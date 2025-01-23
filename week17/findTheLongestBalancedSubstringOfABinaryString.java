package week17;

public class findTheLongestBalancedSubstringOfABinaryString {
    public int findTheLongestBalancedSubstring(String s) {
        int maxLen = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            int zeros = 0;
            int ones = 0;
            
            int j = i;
            while (j < n && s.charAt(j) == '0') {
                zeros++;
                j++;
            }
            
            while (j < n && s.charAt(j) == '1') {
                ones++;
                j++;
            }
            
            maxLen = Math.max(maxLen, 2 * Math.min(zeros, ones));
        }
        
        return maxLen;
    }
}

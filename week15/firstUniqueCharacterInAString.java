package week15;

public class firstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        //initialize array with length 26
        int[] freq = new int[26];
        
        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}

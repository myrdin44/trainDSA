package week16;

public class removeLetterToEqualizeFrequency {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];
        
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        
        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']--;
            
            if (isAllEqual(freq)) {
                return true;
            }
            
            //restore frequency for next iteration
            freq[word.charAt(i) - 'a']++;
        }
        
        return false;
    }
    private boolean isAllEqual(int[] freq) {
        int firstNonZero = -1;
        
        for (int f : freq) {
            if (f > 0) {
                firstNonZero = f;
                break;
            }
        }
        
        if (firstNonZero == -1) return true;
        
        for (int f : freq) {
            if (f != 0 && f != firstNonZero) {
                return false;
            }
        }
        
        return true;
    }
}

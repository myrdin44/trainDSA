package week17;

public class findMaximumNumberOfStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        int pairs = 0;
        boolean[] used = new boolean[words.length];
        
        for (int i = 0; i < words.length - 1; i++) {
            if (used[i]) continue;
            
            for (int j = i + 1; j < words.length; j++) {
                if (used[j]) continue;
                
                if (isReverse(words[i], words[j])) {
                    pairs++;
                    used[i] = true;
                    used[j] = true;
                    break;
                }
            }
        }
        
        return pairs;
    }

    private boolean isReverse(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        int left = 0;
        int right = s2.length() - 1;
        
        while (left < s1.length()) {
            if (s1.charAt(left) != s2.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}

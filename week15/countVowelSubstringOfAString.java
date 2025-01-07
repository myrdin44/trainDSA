package week15;

import java.util.HashSet;
import java.util.Set;

public class countVowelSubstringOfAString {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 4; j < n; j++) { 
                if (isVowelSubstring(word, i, j)) {
                    count++;
                }
            }
        }
        
        return count;
    }
    private boolean isVowelSubstring(String word, int start, int end) {
        Set<Character> vowels = new HashSet<>();
        
        for (int i = start; i <= end; i++) {
            char c = word.charAt(i);
            
            if (!isVowel(c)) {
                return false;
            }
            
            vowels.add(c);
        }
        
        return vowels.size() == 5;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

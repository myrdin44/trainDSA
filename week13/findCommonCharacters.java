package week13;

import java.util.ArrayList;
import java.util.List;

public class findCommonCharacters {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        
        for (int i = 0; i < 26; i++) {
            minFreq[i] = 100;  //max constraint for word length
        }
        
        for (String word : words) {
            //frequencies in current word
            int[] currFreq = new int[26];
            for (char c : word.toCharArray()) {
                currFreq[c - 'a']++;
            }
            
            //update min frequencies
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], currFreq[i]);
            }
        }
        
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char)(i + 'a')));
                minFreq[i]--;
            }
        }
        
        return result;
    }
}

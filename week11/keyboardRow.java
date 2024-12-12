package week11;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class keyboardRow {
    public String[] findWords(String[] words) {
        Set<Character> row1 = Set.of('q','w','e','r','t','y','u','i','o','p');
        Set<Character> row2 = Set.of('a','s','d','f','g','h','j','k','l');
        Set<Character> row3 = Set.of('z','x','c','v','b','n','m');
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String lower = word.toLowerCase();
            
            if (oneRow(lower, row1) || oneRow(lower, row2) || oneRow(lower, row3)) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
    private boolean oneRow(String word, Set<Character> row) {
        for (char c : word.toCharArray()) {
            if (!row.contains(c)) {
                return false;
            }
        }
        return true;
    }
}

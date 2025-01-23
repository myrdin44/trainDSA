package week17;

import java.util.HashSet;
import java.util.Set;

public class minimizeStringLength {
    public int minimizedStringLength(String s) {
        Set<Character> uniqueChar = new HashSet<>();

        for (char ch : s.toCharArray()) {
            uniqueChar.add(ch);
        }

        return uniqueChar.size();
    }
}

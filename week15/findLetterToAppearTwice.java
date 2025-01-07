
package week15;

import java.util.HashMap;

public class findLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        char res = ' ';

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            if (freq.get(ch) == 2) {
                res = ch;
                break;
            }
        }

        return res;
    }
}
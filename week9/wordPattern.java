package week9;

import java.util.HashMap;

public class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        s = s.replaceAll("\\s+", " ");
        String divi [] = s.split(" ");

        if (divi.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ichar = pattern.charAt(i);
            String word = divi[i];

            if (charToWord.containsKey(ichar)) {
                if (!charToWord.get(ichar).equals(word)) {
                    return false;
                }
            } else {
                charToWord.put(ichar, word);
            }

            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != ichar) {
                    return false;
                }
            } else {
                wordToChar.put(word, ichar);
            }
        }

        return true;
    }
}

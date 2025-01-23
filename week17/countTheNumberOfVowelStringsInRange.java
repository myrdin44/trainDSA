package week17;

public class countTheNumberOfVowelStringsInRange {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        
        for (int i = left; i <= right; i++) {
            if (isVowelString(words[i])) {
                count++;
            }
        }
        
        return count;
    }
    private boolean isVowelString(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        
        char first = Character.toLowerCase(word.charAt(0));
        char last = Character.toLowerCase(word.charAt(word.length() - 1));
        
        return isVowel(first) && isVowel(last);
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
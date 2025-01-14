package week16;

public class circularSentence {
    public boolean isCircularSentence(String sentence) {
        if (sentence == null || sentence.length() <= 1) {
            return true;
        }
        
        String[] words = sentence.split(" ");
        
        if (words.length == 1) {
            return words[0].charAt(0) == words[0].charAt(words[0].length() - 1);
        }
        
        for (int i = 0; i < words.length - 1; i++) {
            String currentWord = words[i];
            String nextWord = words[i + 1];
            
            char lastChar = currentWord.charAt(currentWord.length() - 1);
            char firstChar = nextWord.charAt(0);
            
            if (lastChar != firstChar) {
                return false;
            }
        }
        
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        return lastWord.charAt(lastWord.length() - 1) == firstWord.charAt(0);
    }
}

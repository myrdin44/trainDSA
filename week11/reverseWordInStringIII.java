package week11;

public class reverseWordInStringIII {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder(words[i]).reverse();
            
            result.append(reversedWord);
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}

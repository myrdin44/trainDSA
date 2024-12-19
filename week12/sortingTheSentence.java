package week12;

public class sortingTheSentence {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        
        String[] originalWords = new String[words.length];
        
        for (String word : words) {
            int position = word.charAt(word.length() - 1) - '1';
            
            originalWords[position] = word.substring(0, word.length() - 1);
        }
        
        return String.join(" ", originalWords);
    }
}

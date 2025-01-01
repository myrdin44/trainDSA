package week14;

public class numberOfValidWordInASentence {
    public int countValidWords(String sentence) {
        String[] tokens = sentence.trim().split("\\s+");
        int validCount = 0;
        
        for (String token : tokens) {
            if (isValidWord(token)) {
                validCount++;
            }
        }
        
        return validCount;
    }
    private boolean isValidWord(String token) {
        int hyphens = 0;
        int punctuation = 0;
        int n = token.length();
        
        if (n == 0) return false;
        
        for (int i = 0; i < n; i++) {
            char c = token.charAt(i);
            
            if (Character.isDigit(c)) {
                return false;
            }
            
            if (c == '-') {
                hyphens++;
                if (hyphens > 1 || i == 0 || i == n-1) {
                    return false;
                }
                if (!Character.isLowerCase(token.charAt(i-1)) || 
                    !Character.isLowerCase(token.charAt(i+1))) {
                    return false;
                }
            }
            
            if (c == '!' || c == '.' || c == ',') {
                punctuation++;
                if (punctuation > 1 || i != n-1) {
                    return false;
                }
            }
        }
        
        return true;
    }
}

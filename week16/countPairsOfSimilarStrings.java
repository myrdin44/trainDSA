package week16;

public class countPairsOfSimilarStrings {
    public int similarPairs(String[] words) {
        int count = 0;
        int n = words.length;
        
        String[] signatures = new String[n];
        for (int i = 0; i < n; i++) {
            signatures[i] = getSignature(words[i]);
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (signatures[i].equals(signatures[j])) {
                    count++;
                }
            }
        }
        
        return count;
    }
    private String getSignature(String word) {
        boolean[] present = new boolean[26];
        
        for (char c : word.toCharArray()) {
            present[c - 'a'] = true;
        }
        
        StringBuilder signature = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (present[i]) {
                signature.append((char)('a' + i));
            }
        }
        
        return signature.toString();
    }
}

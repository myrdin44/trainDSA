package week15;

public class decodeTheMessage {
    public String decodeMessage(String key, String message) {
        char[] mapping = new char[26];
        boolean[] used = new boolean[26];
        char currentChar = 'a';
        
        for (char c : key.toCharArray()) {
            if (c != ' ' && !used[c - 'a']) {
                mapping[c - 'a'] = currentChar;
                used[c - 'a'] = true;
                currentChar++;
            }
        }
        
        // Decode the message using the substitution table
        StringBuilder decoded = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                decoded.append(' ');
            } else {
                decoded.append(mapping[c - 'a']);
            }
        }
        
        return decoded.toString();
    }
}

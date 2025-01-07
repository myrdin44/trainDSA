package week15;

public class greatestEnglishLetterInUpperAndLowerCase {
    public String greatestLetter(String s) {
        boolean[] uppercase = new boolean[26];
        boolean[] lowercase = new boolean[26];
        
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercase[c - 'A'] = true;
            } else {
                lowercase[c - 'a'] = true;
            }
        }
        
        for (int i = 25; i >= 0; i--) {
            if (uppercase[i] && lowercase[i]) {
                return String.valueOf((char)(i + 'A'));
            }
        }
        
        return "";
    }
}

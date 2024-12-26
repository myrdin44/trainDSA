package week13;

public class replaceAllDigitWithCharacters {
    public String replaceDigits(String s) {
        char result [] = s.toCharArray();
        for (int i = 1; i < result.length; i+=2) {
            result[i] = shift(result[i-1],result[i]-'0');
        }
        return new String(result);
    }

    public char shift(char c, int x) {
        return (char) (c+x);
    }
}

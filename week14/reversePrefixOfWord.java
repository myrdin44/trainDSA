package week14;

public class reversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int index = -1;
        char c [] = word.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ch) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return word;
        }

        StringBuilder result = new StringBuilder();
        for (int i = index; i > -1; i--) {
            result.append(String.valueOf(c[i]));
        }
        for (int i = index + 1; i < c.length; i++) {
            result.append(String.valueOf(c[i]));
        }

        return result.toString();
    }
}

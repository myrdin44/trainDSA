package week13;

public class reverseWordsInAString {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\\s+", " ");
        StringBuilder result = new StringBuilder();
        String separate [] = s.split(" ");

        for (int i = separate.length - 1; i > 0; i--) {
            result.append(separate[i] + " ");
        }

        result.append(separate[0]);

        return result.toString();
    }
}

package week12;

public class rearrangeSpaceBetweenWords {
    public String reorderSpaces(String text) {
        int countSpaces = 0;
        for (char ch : text.toCharArray()) {
            if (ch == ' ') countSpaces++;
        }

        String[] words = text.trim().split("\\s+");
        if (words.length == 0) return " ".repeat(countSpaces);

        int divide = words.length > 1 ? countSpaces / (words.length - 1) : 0;
        int remain = words.length > 1 ? countSpaces % (words.length - 1) : countSpaces;

        String separator = " ".repeat(divide);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            result.append(words[i]).append(separator);
        }
        result.append(words[words.length - 1]);

        result.append(" ".repeat(remain));

        return result.toString();
    }
}

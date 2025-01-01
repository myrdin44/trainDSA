package week14;

public class checkIfStringIsAPrefixOfArray {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder result = new StringBuilder("");

        for (String word : words) {
            if (result.toString().length() < s.length()) {
                result.append(word);
            }
            if (result.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}

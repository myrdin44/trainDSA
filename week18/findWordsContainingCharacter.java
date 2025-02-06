import java.util.ArrayList;
import java.util.List;

public class findWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (isContains(words[i], x)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean isContains(String word,char c) {
        for (char ch : word.toCharArray()) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    }
}

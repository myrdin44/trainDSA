package week14;

public class maximumNumberOfWordYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        String words [] = text.trim().split("\\s+");
        int initLength = words.length;
        if (brokenLetters.length() == 0) {
            return initLength;
        }

        char broken [] = brokenLetters.toCharArray();

        for(String word : words) {
            String clone = word;
            for (char ch : broken) {
                if (word.indexOf(ch) != -1) {
                    initLength--;
                    break;
                }
            }

        }

        return initLength;
    }
}

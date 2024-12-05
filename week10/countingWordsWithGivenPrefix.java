package week10;

public class countingWordsWithGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int sizeCheck = pref.length();
        for (String str : words) {
            if (str.length() >= sizeCheck) {
                if (str.startsWith(pref)) {
                    count++;
                }
            }
        }
        return count;
    }
}

package week14;

public class checkIfAllCharectersHaveEqualNumberOfOccurences {
    public boolean areOccurrencesEqual(String s) {
        int [] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int firstOccurence = 0;
        for (int i = 0;i < 26; i++) {
            if (freq[i] > 0) {
                firstOccurence = freq[i];
                break;
            }
        }

        System.out.println(firstOccurence);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0 && freq[i] != firstOccurence) {
                return false;
            }
        }

        return true;
    }
}

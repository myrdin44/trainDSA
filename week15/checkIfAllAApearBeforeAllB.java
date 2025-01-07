package week15;

public class checkIfAllAApearBeforeAllB {
    public boolean checkString(String s) {
        int maxAIndex = -1;
        int minBIndex = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' && i > maxAIndex) {
                maxAIndex = i;
            }
            if (s.charAt(i) == 'b' && i < minBIndex) {
                minBIndex = i;
            }
        }

        return maxAIndex < minBIndex ? true : false;
    }
}

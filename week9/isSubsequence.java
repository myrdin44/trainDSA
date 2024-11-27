package week9;

public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        boolean result [] = new boolean[s.length()];
        for (int k = 0; k < s.length(); k++) {
            result[k] = false;
        }

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                result[i] = true;
                i++;
                j++;
            } else {
                j++;
            }
        }
        for (boolean check : result) {
            if (!check) {
                return false;
            }
        }

        return true;
    }
}

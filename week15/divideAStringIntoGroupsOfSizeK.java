package week15;

public class divideAStringIntoGroupsOfSizeK {
    public String[] divideString(String s, int k, char fill) {
        int size = (s.length() % k == 0) ? s.length()/k : s.length()/k + 1;
        String result [] = new String[size];
        int index = 0;

        int current = 0;
        while (current + k <= s.length()) {
                result[index++] = s.substring(current, current + k);
                current += k;
        }
        if (s.length() % k != 0) {
            int remain = s.length() % k;
            StringBuilder fillUp = new StringBuilder();
            fillUp.append(s.substring(current));
            for (int i = 0; i < k - remain; i++) {
                fillUp.append(String.valueOf(fill));
            }
            result[index] = fillUp.toString();
        }

        return result;
    }
}

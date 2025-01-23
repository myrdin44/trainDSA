package week17;

public class makeThreeStringEquals {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int index = 0;
        int l = Math.min(s1.length(),Math.min(s2.length(), s3.length()));

        while (index < l) {
            if (s1.charAt(index) != s2.charAt(index) ||s2.charAt(index) != s3.charAt(index) || s1.charAt(index) != s3.charAt(index)) {
                break;
            } else {
                index++;
            }
        }

        if (index == 0) {
            return -1;
        }

        return (s1.length() + s2.length() + s3.length()) - 3*index;
    }
}

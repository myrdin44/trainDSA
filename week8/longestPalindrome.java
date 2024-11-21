package week8;

public class longestPalindrome {
    public int longestPalindrome(String s) {
        int freq [] = new int[72];

        for (char ch : s.toCharArray()) {
            freq[ch - 'A']++;
        }

        int maxLength = 0;
        boolean isContainOdd = false;

        for (int ele : freq) {
            maxLength += (ele >> 1) << 1;
            if (ele % 2 != 0) {
                isContainOdd = true;
            }
        }

        if (isContainOdd) {
            maxLength++;
        }

        return maxLength;
    } 
}

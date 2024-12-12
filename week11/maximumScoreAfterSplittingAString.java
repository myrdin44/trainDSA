package week11;

public class maximumScoreAfterSplittingAString {
    public int maxScore(String s) {
        int maxScore = 0;
        int totalOnes = 0;
        
        // Count total number of ones in the string
        for (char c : s.toCharArray()) {
            if (c == '1') {
                totalOnes++;
            }
        }
        
        int zerosOnLeft = 0;
        int onesOnRight = totalOnes;
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zerosOnLeft++;
            }
            else {
                onesOnRight--;
            }
            
            int currentScore = zerosOnLeft + onesOnRight;
            maxScore = Math.max(maxScore, currentScore);
        }
        
        return maxScore;
    }
}

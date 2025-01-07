package week15;

public class checkDistanceBetweenSameLetters {
    public boolean checkDistances(String s, int[] distance) {

        //initialize array fill with -1 to calculate distance
        int[] firstOccurrence = new int[26];
        for (int i = 0; i < 26; i++) {
            firstOccurrence[i] = -1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a';
            if (firstOccurrence[charIndex] == -1) {
                firstOccurrence[charIndex] = i;
            } else {
                int actualDistance = i - firstOccurrence[charIndex] - 1;
                if (actualDistance != distance[charIndex]) {
                    return false;
                }
            }
        }
        
        return true;

    }
}

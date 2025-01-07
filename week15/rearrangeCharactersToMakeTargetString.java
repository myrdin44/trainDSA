package week15;

public class rearrangeCharactersToMakeTargetString {
    public int rearrangeCharacters(String s, String target) {
        int[] sourceFreq = new int[26];
        int[] targetFreq = new int[26];
        
        //frequencies
        for (char c : s.toCharArray()) {
            sourceFreq[c - 'a']++;
        }
        for (char c : target.toCharArray()) {
            targetFreq[c - 'a']++;
        }
        
        //minimum ratio between source and target frequencies
        int minCopies = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (targetFreq[i] > 0) {
                minCopies = Math.min(minCopies, sourceFreq[i] / targetFreq[i]);
            }
        }
        
        return minCopies;
     }
}

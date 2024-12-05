package week10;

public class shoirtestDistanceToCharacter {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];
        
        int lastOccurrence = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                lastOccurrence = i;
                answer[i] = 0;
            } else if (lastOccurrence != -1) {
                answer[i] = i - lastOccurrence;
            } else {
                answer[i] = Integer.MAX_VALUE;
            }
        }
        
        lastOccurrence = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                lastOccurrence = i;
                answer[i] = 0;
            } else if (lastOccurrence != -1) {
                answer[i] = Math.min(answer[i], lastOccurrence - i);
            }
        }
        
        return answer;
    }
}

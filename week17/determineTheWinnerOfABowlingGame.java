package week17;

public class determineTheWinnerOfABowlingGame {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = calculateScore(player1);
        int score2 = calculateScore(player2);

        if (score1 > score2) return 1;
        if (score2 > score1) return 2;
        return 0;
    }

    private int calculateScore(int[] player) {
        int score = 0;
        int n = player.length;
        
        for (int i = 0; i < n; i++) {
            boolean shouldDouble = false;
            
            if (i > 0 && player[i-1] == 10) {
                shouldDouble = true;
            }
            if (i > 1 && player[i-2] == 10) {
                shouldDouble = true;
            }
            
            score += shouldDouble ? 2 * player[i] : player[i];
        }
        
        return score;
    }
}

package week17;

import java.util.HashSet;
import java.util.Set;

public class findTheLoserOfTheCircularGames {
    public int[] circularGameLosers(int n, int k) {
        Set<Integer> received = new HashSet<>();
        
        int currentPlayer = 1;
        received.add(currentPlayer);
        
        int multiplier = 1;
        
        while (true) {
            // Calculate next player position
            int steps = multiplier * k;
            
            currentPlayer = ((currentPlayer - 1 + steps) % n) + 1;
            
            if (received.contains(currentPlayer)) {
                break;
            }
            
            received.add(currentPlayer);
            multiplier++;
        }
        
        int[] losers = new int[n - received.size()];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (!received.contains(i)) {
                losers[index++] = i;
            }
        }
        
        return losers;

    }
}

package week12;

import java.util.HashSet;
import java.util.Set;

public class pathCrossing {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
            
            int x = 0, y = 0;
            
            visited.add("0,0");
            
            for (char move : path.toCharArray()) {
                switch(move) {
                    case 'N':
                        y++;
                        break;
                    case 'S':
                        y--;
                        break;
                    case 'E':
                        x++;
                        break;
                    case 'W':
                        x--;
                        break;
                }
                
                String currentPoint = x + "," + y;
                
                if (visited.contains(currentPoint)) {
                    return true;
                }
                
                visited.add(currentPoint);
            }
            
            return false;
    }
}

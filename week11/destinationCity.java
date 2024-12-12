package week11;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class destinationCity {
    public String destCity(List<List<String>> paths) {
        Set<String> sourceCities = new HashSet<>();
        
        for (List<String> path : paths) {
            sourceCities.add(path.get(0));
        }
        
        for (List<String> path : paths) {
            String destination = path.get(1);
            if (!sourceCities.contains(destination)) {
                return destination;
            }
        }
        
        return ""; 
    }
}

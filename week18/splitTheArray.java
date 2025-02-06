import java.util.HashMap;

public class splitTheArray {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        for (int f : freq.values()) {
            if (f > 2) {
                return false;
            }
        }

        return true;
    }
}

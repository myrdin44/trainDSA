public class numberOfChangingKey {
    public int countKeyChanges(String s) {
        if (s == null || s.length() <= 1) {
            return 0;
        }
        
        int changes = 0;
        
        s = s.toLowerCase();
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i-1)) {
                changes++;
            }
        }
        
        return changes;
    }
}
